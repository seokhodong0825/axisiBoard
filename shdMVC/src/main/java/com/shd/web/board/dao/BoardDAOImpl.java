package com.shd.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.shd.common.Search;
import com.shd.web.board.model.BoardVO;
import com.shd.web.board.model.ReplyVO;

@Repository

public class BoardDAOImpl implements BoardDAO {
	
	/** 공통 경로 */
	private static final String NAMESPACE = "com.shd.web.board.boardMapper";
	private static final String NAMESPACE_REPLY = "com.shd.web.board.replyMapper";

	@Inject
	private SqlSession sqlSession;

	/** 각 경로에 있는 mapper 퀴리문을 가져옴 */
	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {

		return sqlSession.selectList(NAMESPACE + ".getBoardList", search);

	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {

		return sqlSession.selectOne(NAMESPACE + ".getBoardContent", bid);

	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {

		return sqlSession.insert(NAMESPACE + ".insertBoard", boardVO);

	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateBoard", boardVO);

	}

	@Override
	public int deleteBoard(int bid) throws Exception {

		return sqlSession.insert(NAMESPACE + ".deleteBoard", bid);

	}

	@Override
	public int updateViewCnt(int bid) throws Exception {

		return sqlSession.update(NAMESPACE + ".updateViewCnt", bid);

	}

	// 총 게시글 개수 확인
	@Override
	public int getBoardListCnt(Search search) throws Exception {

		return sqlSession.selectOne(NAMESPACE + ".getBoardListCnt", search);

	}

	// 댓글 리스트
	@Override
	public List<ReplyVO> getReplyList(int bid) throws Exception {

		return sqlSession.selectList(NAMESPACE_REPLY + ".getReplyList", bid);

	}

	@Override
	public int saveReply(ReplyVO replyVO) throws Exception {

		return sqlSession.insert(NAMESPACE_REPLY + ".saveReply", replyVO);

	}

	@Override
	public int updateReply(ReplyVO replyVO) throws Exception {

		return sqlSession.update(NAMESPACE_REPLY + ".updateReply", replyVO);

	}

	@Override
	public int deleteReply(int rid) throws Exception {

		return sqlSession.delete(NAMESPACE_REPLY + ".deleteReply", rid);

	}

}

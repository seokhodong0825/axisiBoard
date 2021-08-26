package com.shd.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.shd.common.Search;
import com.shd.web.board.model.BoardVO;

@Repository

public class BoardDAOImpl implements BoardDAO {

	@Inject

	private SqlSession sqlSession;

	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {

		return sqlSession.selectList("com.shd.web.board.boardMapper.getBoardList", search);

	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {

		return sqlSession.selectOne("com.shd.web.board.boardMapper.getBoardContent", bid);

	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {

		return sqlSession.insert("com.shd.web.board.boardMapper.insertBoard", boardVO);

	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {

		return sqlSession.update("com.shd.web.board.boardMapper.updateBoard", boardVO);

	}

	@Override
	public int deleteBoard(int bid) throws Exception {

		return sqlSession.insert("com.shd.web.board.boardMapper.deleteBoard", bid);

	}

	@Override
	public int updateViewCnt(int bid) throws Exception {

		return sqlSession.update("com.shd.web.board.boardMapper.updateViewCnt", bid);

	}
	
	//총 게시글 개수 확인
	@Override
	public int getBoardListCnt(Search search) throws Exception {

		return sqlSession.selectOne("com.shd.web.board.boardMapper.getBoardListCnt", search);

	}

}

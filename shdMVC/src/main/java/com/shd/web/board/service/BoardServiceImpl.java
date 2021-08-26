package com.shd.web.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shd.common.Search;
import com.shd.web.board.dao.BoardDAO;

import com.shd.web.board.model.BoardVO;
import com.shd.web.board.model.ReplyVO;

@Service

public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDAO;

	/** 목록 이동 페이지 */
	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {

		return boardDAO.getBoardList(search);

	}

	/** 글쓰기 관련 페이지 */
	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {

		boardDAO.insertBoard(boardVO);

	}

	@Transactional
	@Override
	public BoardVO getBoardContent(int bid) throws Exception {

		BoardVO boardVO = new BoardVO();
		boardDAO.updateViewCnt(bid);
		boardVO = boardDAO.getBoardContent(bid);

		return boardVO;

	}

	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {

		boardDAO.updateBoard(boardVO);

	}

	@Override
	public void deleteBoard(int bid) throws Exception {

		boardDAO.deleteBoard(bid);

	}

	// 총 게시글 개수 확인
	@Override
	public int getBoardListCnt(Search search) throws Exception {

		return boardDAO.getBoardListCnt(search);

	}

	@Override
	public List<ReplyVO> getReplyList(int bid) throws Exception {

		return boardDAO.getReplyList(bid);
	}

	@Override
	public void saveReply(ReplyVO replyVO) throws Exception {
		
		boardDAO.saveReply(replyVO);
	}

}
package com.shd.web.board.service;


import java.util.List;

import com.shd.common.Search;
import com.shd.web.board.model.BoardVO;
import com.shd.web.board.model.ReplyVO;



public interface BoardService {

	/** 목록 이동 페이지 */
	public List<BoardVO> getBoardList(Search search) throws Exception;
	
	/** 글쓰기 관련 페이지 */
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	/** 조회 페이지 */
	public BoardVO getBoardContent(int bid) throws Exception;

	public void updateBoard(BoardVO boardVO) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;
	
	//총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;

	/** 댓글 페이지 */
	public List<ReplyVO> getReplyList(int bid) throws Exception;

	public void saveReply(ReplyVO replyVO) throws Exception;

	

}
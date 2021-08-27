package com.shd.web.board.service;


import java.util.List;

import com.shd.common.Search;
import com.shd.web.board.model.BoardVO;
import com.shd.web.board.model.ReplyVO;



public interface BoardService {

	/** 게시물 목록 */
	public List<BoardVO> getBoardList(Search search) throws Exception;
	
	/** 게시물 작성 */
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	/** 게시물 상세 조회 */
	public BoardVO getBoardContent(int bid) throws Exception;

	/** 게시물 수정 및 저장 */
	public void updateBoard(BoardVO boardVO) throws Exception;
	
	/** 게시물 삭제 */
	public void deleteBoard(int bid) throws Exception;
	
	/** 총 게시글 개수 확인 */
	public int getBoardListCnt(Search search) throws Exception;

	/** 댓글 목록 */
	public List<ReplyVO> getReplyList(int bid) throws Exception;

	/** 댓글 저장 */
	public void saveReply(ReplyVO replyVO) throws Exception;

	/** 댓글 수정 */
	public void updateReply(ReplyVO replyVO) throws Exception;

	/**댓글 삭제 */
	public void deleteReply(int rid) throws Exception;

	

}
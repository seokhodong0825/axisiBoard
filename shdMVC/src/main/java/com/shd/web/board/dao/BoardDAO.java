package com.shd.web.board.dao;

import java.util.List;

import com.shd.common.Search;
import com.shd.web.board.model.BoardVO;
import com.shd.web.board.model.ReplyVO;

public interface BoardDAO {
	
	/** 게시물 목록 */
	//** serch에서 pagination을 extends해서 페이징, 검색 같이 처리 *//
	public List<BoardVO> getBoardList(Search search) throws Exception;

	/** 신규 게시글 작성 */
	public BoardVO getBoardContent(int bid) throws Exception;
	
	/** 게시글 insert */
	public int insertBoard(BoardVO boardVO) throws Exception;

	/** 게시글 수정 및 저장 */
	public int updateBoard(BoardVO boardVO) throws Exception;

	/** 게시글 삭제 */
	public int deleteBoard(int bid) throws Exception;

	/** 조회 수 */
	public int updateViewCnt(int bid) throws Exception;

	/** 총 게시글 개수 확인 */
	public int getBoardListCnt(Search search) throws Exception;

	/** 댓글 목록 */
	public List<ReplyVO> getReplyList(int bid) throws Exception;

	/** 댓글 저장 */
	public int saveReply(ReplyVO replyVO) throws Exception;

	/** 댓글 수정 */
	public int updateReply(ReplyVO replyVO) throws Exception;

	/** 댓글 삭제 */
	public int deleteReply(int rid) throws Exception;

}

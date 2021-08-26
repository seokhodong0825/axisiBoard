package com.shd.web.board.model;

public class ReplyVO {
	
	/** 댓글 번호 */
	public int rid;
	/** 게시물 번호 */
	public int bid;
	/** 댓글 내용 */
	public String content;
	/** 작성자 */
	public String reg_id;
	/** 작성일 */
	public String reg_dt;
	/** 수정일 */
	public String edit_dt;
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getEdit_dt() {
		return edit_dt;
	}
	public void setEdit_dt(String edit_dt) {
		this.edit_dt = edit_dt;
	}

}

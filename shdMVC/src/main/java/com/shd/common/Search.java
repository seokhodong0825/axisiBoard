package com.shd.common;

public class Search extends Pagination {
	
	/** 검색 조건 */
	private String searchType;
	
	/** 입력 값 */
	private String keyword;
	
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}	
	
	


}

package com.winter.app.util;

public class Pager {
	private Long startRow;
	private Long lastRow;
	private Long perPage=10L;//몇개씩 조회
	private Long page;
	
	private Long totalPage;
	private Long startNum;
	private Long lastNum;
	
	//이전 블럭이 없으면 true;
	private boolean start;
	//다음 블럭이 없으면 true;
	private boolean last;
	
	//검색 관련
	private String search;
	private String kind;
	
	
	public void makeRow() {
		this.lastRow=this.getPage()*this.getPerPage();
		this.startRow=(this.getPage()-1)*this.getPerPage()+1;
	}
	
	public void makeNum(Long totalCount) {
		if(totalCount<1) {
			totalCount=1L;
		}
		
		Long totalpage = 0L;
		totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage() !=0) {
			totalpage++;
		}
		
		this.setTotalPage(totalpage);
		
		
		Long totalblock = 0L;
		Long perblock = 5L;
		totalblock= totalpage/perblock;
		if(totalpage%perblock !=0) {
			totalblock++;
		}
		
		Long curblock = 0L;
		curblock = this.getPage()/perblock;
		if(this.getPage()%perblock !=0) {
			curblock++;
		}
		
		Long startNum=0L;
		Long LastNum=curblock*perblock;
		startNum=LastNum-perblock+1;
		
		this.setStartNum(startNum);
		this.setLastNum(LastNum);
		
		if(curblock==0) {
			this.setStart(true);
		}
		
		if(curblock==totalblock) {
			this.setLastNum(totalPage);
			this.setLast(true);
			
		}
	}
	
	public String getSearch() {
		
		if(this.search==null) {
			this.search="";
		}
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	
	
	
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getPerPage() {
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getPage() {
		if(this.page==null||this.page<1) {
			this.page=1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getStartNum() {
		if(startNum==0) {
			startNum=1L;
		}
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public boolean isStart() {
		return start;
	}
	public void setStart(boolean start) {
		this.start = start;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	
}
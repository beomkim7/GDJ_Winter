package com.winter.app.board;

import java.util.List;

import com.winter.app.util.Pager;

public interface BoardDAO {
	
	//totalCount
	public Long getTotalCount(Pager pager)throws Exception;
	
	//getList
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	//getDetail
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	//setAdd
	public int setAdd(BoardDTO boardDTO) throws Exception;
	
	//setUpdate
	public int setUpdate(BoardDTO boardDTO)throws Exception;
	
	//setDelete
	public int setDelete(BoardDTO boardDTO)throws Exception;
}

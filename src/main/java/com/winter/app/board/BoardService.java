package com.winter.app.board;

import java.util.List;

import com.winter.app.util.Pager;

public interface BoardService {
	
	
	//getList
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	//getDetail
	public BoardDTO getDetail(BoardDTO boardDTO)throws Exception;
	//getAdd
	public int getAdd(BoardDTO boardDTO)throws Exception;
	//getUpdate
	public int getUpdate(BoardDTO boardDTO)throws Exception;
	//getDelete
	public int getDelete(BoardDTO boardDTO)throws Exception;
}

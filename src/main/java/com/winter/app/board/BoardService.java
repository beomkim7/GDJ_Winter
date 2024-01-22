package com.winter.app.board;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;

public interface BoardService {
	
	
	//getList
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	//getDetail
	public BoardDTO getDetail(BoardDTO boardDTO)throws Exception;
	//getAdd
	public int setAdd(BoardDTO boardDTO,MultipartFile [] attachs)throws Exception;
	//getUpdate
	public int setUpdate(BoardDTO boardDTO,MultipartFile [] attachs)throws Exception;
	//getDelete
	public int setDelete(BoardDTO boardDTO)throws Exception;
}

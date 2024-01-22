package com.winter.app.board.qna;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;

@Service
public class QnaService implements BoardService {
	@Autowired
	private QnaDAO qnaDAO;
	@Autowired
	private FileManager fileManager;
	@Autowired
	private ServletContext servletContext;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		pager.makeRow();
		Long totalcount=qnaDAO.getTotalCount(pager);
		pager.makeNum(totalcount);
		
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		
		
		return qnaDAO.getDetail(boardDTO); 
	}

	@Override
	public int setAdd(BoardDTO boardDTO,MultipartFile [] attachs) throws Exception {
		int result = qnaDAO.setAdd(boardDTO);
		
		String path = servletContext.getRealPath("./resources/upload/qna");
		
		for(MultipartFile f:attachs) {
			
			if(f.isEmpty()) {
				continue;
			}
			String fileName = fileManager.fileSave(path, f);
			
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(f.getOriginalFilename());
			boardFileDTO.setBoardNum(boardDTO.getBoardNum());
			result=qnaDAO.setFileAdd(boardFileDTO);
			
		}
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO,MultipartFile [] attachs) throws Exception {
		
		return qnaDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		List<BoardFileDTO> files = qnaDAO.getFileList(boardDTO);
		String Path = servletContext.getRealPath("/resources/upload/qna");
		for(BoardFileDTO b:files) {
			fileManager.fileDelete(Path, b.getFileName());
		}
		
		int result = qnaDAO.setFileDelete(boardDTO);
		
		result = qnaDAO.setDelete(boardDTO);
		return result;
	}

}

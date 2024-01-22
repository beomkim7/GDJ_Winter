package com.winter.app.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	//파일삭제
	public boolean fileDelete(String path,String fileName) throws Exception{
		File file = new File(path,fileName);
		return file.delete();
	}
	
	//파일 저장
	public String fileSave(String path,MultipartFile file)throws Exception{
		File f = new File(path);
		
		if(f.isFile()) {
			throw new Exception();
			//return;
		}
		if(!f.exists()) {
			f.mkdirs();
		}
		
		//2.어떤 파일명
		//a.시간
		Calendar ca = Calendar.getInstance();
		String fileName = ca.getTimeInMillis()+"_"+file.getOriginalFilename();
		System.out.println(fileName);
		
		//b. UUID
		fileName=UUID.randomUUID().toString()+"_"+file.getOriginalFilename();
		System.out.println(fileName);
		
		f = new File(f,fileName);
		
		file.transferTo(f);
		
		return fileName;
		
	}
}

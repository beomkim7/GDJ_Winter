package com.winter.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("join")
	public String setJoin(MemberDTO memberDTO)throws Exception{
		return "member/join";
	}
	@PostMapping("join")
	public String setJoin(MemberDTO memberDTO,MultipartFile avatar,Model model)throws Exception{
		int result = memberService.setJoin(memberDTO, avatar);
		
		String path = "./join";
		String msg = "등록 실패";
		if(result > 0) {
			msg = "등록 성공";
			path = "../";
		}
		
		
		model.addAttribute("msg", msg);
		model.addAttribute("path", path);
		
		return "commons/result";
	}
	
}

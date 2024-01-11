package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="add",method = RequestMethod.POST)
	public String add(ProductDTO productDTO,Model model)throws Exception{
		int result = productService.add(productDTO);
		
		String msg = "등록실패";
		
		if(result>0) {
			msg = "등록성공";
		}
		model.addAttribute("msg", msg);
		model.addAttribute("path","./list");
		
		return "commons/result";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String add()throws Exception{
		return "product/add";
	}
	
	@RequestMapping(value="list",method = RequestMethod.GET)
	public ModelAndView getList(Pager pager,Model model)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		System.out.println(pager.getTotalPage());
		List<ProductDTO> ar = productService.getList(pager);
		System.out.println(pager.getTotalPage());
		
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.setViewName("product/list");
		
		return mv;
	}	
	
}
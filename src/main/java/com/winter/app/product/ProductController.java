package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.util.Pager;

@Controller
@RequestMapping(value="product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="list",method = RequestMethod.GET)
	public ModelAndView getList(Pager pager) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.getList(pager);
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		
		return mv;
	}
	
	@RequestMapping(value="add",method = RequestMethod.GET)
	public void getAdd()throws Exception{
		productService.add();
	}
	
	@RequestMapping
	public void getDetail()throws Exception{
		productService.getDetail();
	}
}

package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;


@Service
public class ProductService {
	@Autowired
	private ProductDAO productDAO;
	
	public int add(ProductDTO productDTO)throws Exception{
		return productDAO.add(productDTO);
	}
	
	public List<ProductDTO> getList(Pager pager)throws Exception{
		pager.makeRow();
		Long totalCount = productDAO.getTotal(pager);
		System.out.println(totalCount);
		
		pager.makeNum(totalCount);
		List<ProductDTO> ar = productDAO.getList(pager);
		
		return ar;
	}

	
}
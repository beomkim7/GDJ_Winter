package com.winter.app.products;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.Mytest;
import com.winter.app.product.ProductDAO;
import com.winter.app.product.ProductDTO;

public class ProductDAOTest extends Mytest {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Test
	public void addTest()throws Exception{
		ProductDTO productDTO = new ProductDTO();
		
		for(int i =0;i<100;i++) {
			productDTO.setProductName("test"+i);
			productDTO.setProductContents("");
			productDTO.setProductJumsu(0L);
			productDTO.setProductRate(0L);
			int result = productDAO.add(productDTO);
			if(i%10==1) {
				Thread.sleep(500);
			}
		}
		System.out.println("100개 입력 완료");
			
	}
}

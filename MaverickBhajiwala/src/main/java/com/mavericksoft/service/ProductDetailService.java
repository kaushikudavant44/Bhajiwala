package com.mavericksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mavericksoft.model.ProductDetails;
import com.mavericksoft.repository.ProductDetailsRepository;

@Service
public class ProductDetailService {

	@Autowired
	ProductDetailsRepository productDetailsRepository;
	
	public ProductDetails findProductDetails(int id)
	{
		try {
			ProductDetails pd=productDetailsRepository.findById(id);
			return pd;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
		
	}

	public List<ProductDetails> findAll(Pageable pageable) {
		
		Page<ProductDetails> page = null;
		try {
		 page = productDetailsRepository.findAll(pageable);
			System.out.println("Page = "+page.toList());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return page.toList();
		
	}

	public List<ProductDetails> findByProductCategoryId(Pageable pageable, int productCategoryId) {
		
		Page<ProductDetails> page = null;
		try {
		 page = productDetailsRepository.findByProductCategoryId(productCategoryId,pageable);
			
		 System.out.println("Page = "+page.toList());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return page.toList();
		
	}

	public int countById(int id) {
		try {
			if(id==0) {
				
				return productDetailsRepository.countByIdGreaterThanEqual(id);
			}
			
		return productDetailsRepository.countByProductCategoryId(id);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return 0;
	}	
	

	
}

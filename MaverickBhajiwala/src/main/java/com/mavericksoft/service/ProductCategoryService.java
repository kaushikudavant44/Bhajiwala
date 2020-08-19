package com.mavericksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mavericksoft.model.ProductCategory;
import com.mavericksoft.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {

	@Autowired
	ProductCategoryRepository productCategoryRepository;
	
	public List<ProductCategory> findProductCategoriesList()
	{
		try {
			
			return productCategoryRepository.findAll();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
		
	}
	
}

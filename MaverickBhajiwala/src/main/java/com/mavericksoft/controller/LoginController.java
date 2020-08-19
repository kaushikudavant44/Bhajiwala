/**
 * 
 */
package com.mavericksoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.mavericksoft.common.ApplicationConstant;
import com.mavericksoft.model.ProductCategory;
import com.mavericksoft.model.ProductDetails;
import com.mavericksoft.service.ProductCategoryService;
import com.mavericksoft.service.ProductDetailService;

/**
 * @author kaushiku
 *
 */
@Controller
@SessionScope
public class LoginController {
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@Autowired
	ProductDetailService productDetailService;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView indexPage(HttpServletRequest request)   
	{
		
		System.out.println("inside");
		ModelAndView model=new ModelAndView("index");		
		try {
			
		
		List<ProductCategory> listProductCategory=productCategoryService.findProductCategoriesList();
		
		System.out.println("listProductCategory = "+listProductCategory.toString());
		
		Pageable pageable = PageRequest.of(0, 8);
		List<ProductDetails> listProductDetails=productDetailService.findAll(pageable);
		
		
		
		System.out.println("listProductDetails = "+listProductDetails.toString());
		model.addObject("productList", listProductDetails);
		model.addObject("productCategoryList", listProductCategory);

		model.addObject("message",ApplicationConstant.message);
		//message="";
		

		} catch (Exception e) {
			// TODO: handle exception
		}
		return model;
		
	}

}

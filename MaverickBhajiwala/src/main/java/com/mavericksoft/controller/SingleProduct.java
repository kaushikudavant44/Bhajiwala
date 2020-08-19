package com.mavericksoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.mavericksoft.common.ApplicationConstant;
import com.mavericksoft.model.ProductDetails;
import com.mavericksoft.service.ProductDetailService;

/**
 * 
 * @author kaushiku
 *
 */
@Controller
@SessionScope
@RequestMapping("/singleproduct")
public class SingleProduct {
	
	@Autowired
	ProductDetailService productDetailService;
	
	@RequestMapping(value="/singleprod", method=RequestMethod.GET)

	public ModelAndView showStaffLogin(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("product-single");		

		model.addObject("message",ApplicationConstant.message);
		//message="";
		return model;
		
	}	   
	
	@RequestMapping(value="/getProductDetails/{id}", method=RequestMethod.GET)
	public ModelAndView getProductDetails(HttpServletRequest request,@PathVariable int id)   
	{
		ModelAndView model=new ModelAndView("product-single");		

		try {
		ProductDetails pd=productDetailService.findProductDetails(id);
		
		Pageable pageable = PageRequest.of(0, 4);
		
		
		List<ProductDetails> listProductDetails = productDetailService.findByProductCategoryId(pageable, pd.getProductCategory().getId());
		
		model.addObject("productList", listProductDetails);
		model.addObject("productDeatils", pd);
		
		System.out.println("PD= "+pd.toString());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		model.addObject("message",ApplicationConstant.message);
		//message="";
		return model;
		
	}	   
	
	

}

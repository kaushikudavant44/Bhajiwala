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
import com.mavericksoft.model.ProductCategory;
import com.mavericksoft.model.ProductDetails;
import com.mavericksoft.service.ProductCategoryService;
import com.mavericksoft.service.ProductDetailService;

/**
 * 
 * @author kaushiku
 *
 */
@Controller
@SessionScope
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	ProductDetailService productDetailService;

	@Autowired
	ProductCategoryService productCategoryService;

	@RequestMapping(value = "/shopPage/{pageNo}/{pageLimit}/{productCategoryId}", method = RequestMethod.GET)
	public ModelAndView showStaffLogin(HttpServletRequest request, @PathVariable int pageNo,
			@PathVariable int pageLimit, @PathVariable(required = false) int productCategoryId) {

		// int id=1;
		ModelAndView model = new ModelAndView("shop");
		List<ProductDetails> listProductDetails;
		Pageable pageable = PageRequest.of(pageNo, pageLimit);
		if (productCategoryId == 0) {
			listProductDetails = productDetailService.findAll(pageable);
		} else {
			listProductDetails = productDetailService.findByProductCategoryId(pageable, productCategoryId);
		}
		List<ProductCategory> productCategoryList = productCategoryService.findProductCategoriesList();

		int countOfRecords = productDetailService.countById(productCategoryId);

		System.out.println("count of records = " + countOfRecords);

		int pagesCount = 1;

		if (countOfRecords % pageLimit == 0) {
		
			pagesCount = countOfRecords / pageLimit;
		
		} else {

			pagesCount = countOfRecords / pageLimit + 1;
		}

		
		model.addObject("productCategoryId", productCategoryId);
		model.addObject("pagesCount", pagesCount);
		model.addObject("productCategoryList", productCategoryList);
		model.addObject("productList", listProductDetails);
		model.addObject("message", ApplicationConstant.message);
		// model.addObject("active", ApplicationConstant.activeStatus);
		return model;

	}

	@RequestMapping(value = "/getProductsList/{pageNo}/{pageLimit}", method = RequestMethod.GET)

	public ModelAndView getProductsList(HttpServletRequest request, @PathVariable int pageNo,
			@PathVariable int pageLimit) {
		ModelAndView model = new ModelAndView("shop");

		Pageable pageable = PageRequest.of(pageNo, pageLimit);
		List<ProductDetails> listProductDetails = productDetailService.findAll(pageable);

		System.out.println("product list = " + listProductDetails);

		model.addObject("productList", listProductDetails);
		model.addObject("message", ApplicationConstant.message);
		// message="";
		return model;

	}

}

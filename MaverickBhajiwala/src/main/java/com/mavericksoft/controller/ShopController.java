package com.mavericksoft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.mavericksoft.common.ApplicationConstant;

/**
 * 
 * @author kaushiku
 *
 */
@Controller
@SessionScope
@RequestMapping("/shop")
public class ShopController {
	
	@RequestMapping(value="/shopPage", method=RequestMethod.GET)

	public ModelAndView showStaffLogin(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("shop");		

		model.addObject("message",ApplicationConstant.message);
		//message="";
		return model;
		
	}	

}

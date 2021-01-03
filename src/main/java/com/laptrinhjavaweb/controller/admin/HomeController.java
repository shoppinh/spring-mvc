package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.WebService.EmployeeService;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {
	@Autowired
	private EmployeeService slidesService;

	@RequestMapping(value = "/quan-tri", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		mav.addObject("NhanVien", slidesService.getDataSlides());
		return mav;
	}
	@RequestMapping(value = "/quan-tri/table", method = RequestMethod.GET)
	public ModelAndView tablePage() {
		ModelAndView mav = new ModelAndView("admin/table");
		mav.addObject("NhanVien", slidesService.getDataSlides());
		return mav;
	}
}
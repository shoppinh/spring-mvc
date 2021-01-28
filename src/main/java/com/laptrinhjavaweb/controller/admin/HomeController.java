package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.WebService.EmployeeService;
import com.laptrinhjavaweb.dto.EmployeeDTO;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/quan-tri/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		EmployeeDTO nhanVien = new EmployeeDTO();
		ModelAndView mav = new ModelAndView("admin/home");
		nhanVien.setListResult(employeeService.findAll());
		mav.addObject("NhanVien", nhanVien);
		return mav;
	}

}
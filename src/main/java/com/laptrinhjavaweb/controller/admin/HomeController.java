package com.laptrinhjavaweb.controller.admin;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.WebService.EmployeeService;
import com.laptrinhjavaweb.dto.EmployeeDTO;
import com.laptrinhjavaweb.util.MessageUtil;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private MessageUtil messageUtil;

	@RequestMapping(value = "/quan-tri/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request) {
		EmployeeDTO nhanVien = new EmployeeDTO();
		ModelAndView mav = new ModelAndView("admin/home");
		nhanVien.setListResult(employeeService.findAll());
		if (request.getParameter("message")!= null) {
			Map<String, String> result = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", result.get("message"));
			mav.addObject("alert", result.get("alert"));

		}
		mav.addObject("NhanVien", nhanVien);
		return mav;
	}

}
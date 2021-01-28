package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.WebService.EmployeeService;
import com.laptrinhjavaweb.dto.EmployeeDTO;

@Controller(value="employeeControllerOfAdmin")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(value = "/quan-tri/table", method = RequestMethod.GET)
	public ModelAndView tablePage(@RequestParam(value="id", required = false) String id) {
		ModelAndView mav = new ModelAndView("admin/table");
		EmployeeDTO model = new EmployeeDTO();
		EmployeeDTO nhanVien = new EmployeeDTO();
		if(id != null) {
			model = employeeService.findByID(id);
		}
		nhanVien.setListResult(employeeService.findAll());
		mav.addObject("model", model);
		mav.addObject("nhanVien",nhanVien);
		return mav;
	}
	
	
}

package com.laptrinhjavaweb.controller.admin;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.WebService.DepartmentService;
import com.laptrinhjavaweb.WebService.EmployeeService;
import com.laptrinhjavaweb.dto.EmployeeDTO;
import com.laptrinhjavaweb.util.MessageUtil;

@Controller(value="employeeControllerOfAdmin")
public class EmployeeController {
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private MessageUtil messageUtil;
	
	@RequestMapping(value = "/quan-tri/table", method = RequestMethod.GET)
	public ModelAndView tablePage(@RequestParam(value="id", required = false) String id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin/table");
		EmployeeDTO model = new EmployeeDTO();
		if(id != null) {
			model = employeeService.findByID(id);
		}
		if (request.getParameter("message")!= null) {
			Map<String, String> result = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", result.get("message"));
			mav.addObject("alert", result.get("alert"));
		}
		mav.addObject("model", model);
		mav.addObject("departments",departmentService.findAll());
		return mav;
	}
	
	
}

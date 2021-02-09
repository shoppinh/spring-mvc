package com.laptrinhjavaweb.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.WebService.EmployeeService;
import com.laptrinhjavaweb.dto.EmployeeDTO;

@RestController(value = "employeeAPIOfAdmin")
public class EmployeeAPI {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/api/employee")
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.insert(employeeDTO);
	}

	@PutMapping("/api/employee")
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.update(employeeDTO);
	}

	@DeleteMapping("/api/employee")
	public void deleteEmployee(@RequestBody String[] ids) {
		employeeService.Delete(ids);
	}

}

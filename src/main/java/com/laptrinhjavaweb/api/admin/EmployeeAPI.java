package com.laptrinhjavaweb.api.admin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.EmployeeDTO;

@RestController(value = "employeeAPIOfAdmin")
public class EmployeeAPI {

	@PostMapping("api/empoyee")
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeDTO;
	}
	
	@PutMapping("api/employee")
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeDTO;
	}
	
	@DeleteMapping("api/employee")
	public void deleteEmployee(@RequestBody long[] ids) {
		
	}
	
}

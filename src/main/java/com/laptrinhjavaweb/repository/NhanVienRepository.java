package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.EmployeeEntity;

public interface NhanVienRepository extends JpaRepository<EmployeeEntity, String>{
	
}

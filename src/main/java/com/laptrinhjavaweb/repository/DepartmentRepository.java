package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, String>{
		DepartmentEntity findOneByMaPB(String maPB);
}

package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.UserEntity;

public interface TaiKhoanRepository extends JpaRepository<UserEntity, Long>{
	UserEntity findOneByUserNameAndStatus (String name, int status);

}

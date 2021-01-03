package com.laptrinhjavaweb.Dao;

import java.util.List;

import com.laptrinhjavaweb.mapper.RowMapper;
import com.laptrinhjavaweb.model.NhanVien;

public interface GenericDAO {
	public List<NhanVien> query(String sql, RowMapper<NhanVien> rowMapper, Object... parameters);
}

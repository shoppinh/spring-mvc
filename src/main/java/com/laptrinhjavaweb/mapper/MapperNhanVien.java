package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.NhanVien;

public class MapperNhanVien implements RowMapper<NhanVien>{

	@Override
	public NhanVien mapRow(ResultSet resultSet) {
		NhanVien nhanVien = new NhanVien();
		try {
			nhanVien.setMaNV(resultSet.getString("MaNV"));
			 nhanVien.setTenNV(resultSet.getString("TenNV"));
			 nhanVien.setNgaySinh(resultSet.getDate("NS"));
			 nhanVien.setChucVu(resultSet.getString("ChucVu"));
			 nhanVien.setAvatar(resultSet.getString("Avatar"));
			 nhanVien.setLuong(resultSet.getInt("Luong"));
			 nhanVien.setMieuTa(resultSet.getString("MieuTa"));
		}
		catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		
		return nhanVien;

	}

}

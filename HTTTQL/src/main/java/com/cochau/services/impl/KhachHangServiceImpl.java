package com.cochau.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cochau.dao.KhachhangDAO;
import com.cochau.model.Khachhang;
import com.cochau.services.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService{

	@Autowired
	KhachhangDAO khachhangDAO;
	
	@Override
	public List<Khachhang> getAll() {
		return khachhangDAO.getAll();
	}

}

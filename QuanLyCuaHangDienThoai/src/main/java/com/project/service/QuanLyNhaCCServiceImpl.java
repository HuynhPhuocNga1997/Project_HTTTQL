package com.project.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.QuanLyNhaCungCapDao;
import com.project.model.Nhacungcap;

@Service
@Transactional
public class QuanLyNhaCCServiceImpl implements QuanLyNhaCCService {
	@Autowired(required=false)
	 QuanLyNhaCungCapDao nhacungcapdao;

	@Override
	@Transactional
	public List<Nhacungcap> listNhaCC() {
		// TODO Auto-generated method stub
		return nhacungcapdao.listNhaCC();
	}

	@Override
	@Transactional
	public void themNhaCungCap(Nhacungcap nhacungcap) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public boolean suaNhaCungCap(int id, Nhacungcap nhacungcap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public boolean xoaNhaCungCap(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public Nhacungcap xemthongtin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

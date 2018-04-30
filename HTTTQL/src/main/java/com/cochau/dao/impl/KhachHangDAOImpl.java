package com.cochau.dao.impl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cochau.dao.KhachhangDAO;
import com.cochau.model.Khachhang;

@Transactional
@Repository
public class KhachHangDAOImpl implements KhachhangDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Khachhang> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Khachhang").list();
	}

}

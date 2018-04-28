package com.project.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.project.hibernate_util.HibernateUtil;
import com.project.model.Nhacungcap;
@Repository
public class QuanLyNhaCungCapImpl implements QuanLyNhaCungCapDao{
	public SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	@SuppressWarnings("unchecked")
	@Override
	public List<Nhacungcap> listNhaCC() {
		Session session=sessionFactory.getCurrentSession();
		List<Nhacungcap> list=session.createQuery("from Nhacungcap").list();
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void themNhaCungCap(Nhacungcap nhacungcap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean suaNhaCungCap(int id, Nhacungcap nhacungcap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaNhaCungCap(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Nhacungcap xemthongtin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

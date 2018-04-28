package com.project.service;

import com.project.dao.QuanLyNhaCungCapDao;
import com.project.dao.QuanLyNhaCungCapImpl;

public class Test {
public static void main(String[] args) {
	QuanLyNhaCungCapDao q=new QuanLyNhaCungCapImpl();
	System.out.println(q.listNhaCC());
}
}

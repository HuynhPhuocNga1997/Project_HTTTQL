package com.project.service;

import java.util.List;

import com.project.model.Nhacungcap;

public interface QuanLyNhaCCService {
	public List<Nhacungcap> listNhaCC();

	public void themNhaCungCap(Nhacungcap nhacungcap);

	public boolean suaNhaCungCap(int id, Nhacungcap nhacungcap);

	public boolean xoaNhaCungCap(int id);

	public Nhacungcap xemthongtin(int id);
}

package com.project.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Role {
	
	private String id_role;
	private String role;
	private Collection<TaiKhoan> taikhoan;
	
	@Id
	@Column(name = "id_role")
	public String getId_role() {
		return id_role;
	}
	public void setId_role(String id_role) {
		this.id_role = id_role;
	}
	@Column(name = "role")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@OneToMany(mappedBy = "role")
	public Collection<TaiKhoan> getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(Collection<TaiKhoan> taikhoan) {
		this.taikhoan = taikhoan;
	}

	

}

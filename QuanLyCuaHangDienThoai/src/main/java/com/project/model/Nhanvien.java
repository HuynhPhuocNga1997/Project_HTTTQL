package com.project.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Nhanvien", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Nhanvien {
    private String manhanvien;
    private String tennhanvien;
    private Date ngaysinh;
    private String gioitinh;
    private String diachi;
    private String sodienthoai;
    private String machucvu;
    private Collection<ChamcongNhanvien> chamcongNhanviensByManhanvien;
    private Collection<Donduyethang> donduyethangsByManhanvien;
    private Collection<KhenthuongNhanvien> khenthuongNhanviensByManhanvien;
    private Collection<KyluatNhanvien> kyluatNhanviensByManhanvien;
    private Collection<LuongNhanvien> luongNhanviensByManhanvien;
    private Chucvu chucvuByMachucvu;
    private Collection<Phieunhapkho> phieunhapkhosByManhanvien;
    private TaiKhoan taikhoan;

    @Id
    @Column(name = "Manhanvien")
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Basic
    @Column(name = "Tennhanvien")
    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    @Basic
    @Column(name = "Ngaysinh")
    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Basic
    @Column(name = "Gioitinh")
    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Basic
    @Column(name = "Diachi")
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Basic
    @Column(name = "Sodienthoai")
    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    @Basic
    @Column(name = "Machucvu")
    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nhanvien nhanvien = (Nhanvien) o;
        return Objects.equals(manhanvien, nhanvien.manhanvien) &&
                Objects.equals(tennhanvien, nhanvien.tennhanvien) &&
                Objects.equals(ngaysinh, nhanvien.ngaysinh) &&
                Objects.equals(gioitinh, nhanvien.gioitinh) &&
                Objects.equals(diachi, nhanvien.diachi) &&
                Objects.equals(sodienthoai, nhanvien.sodienthoai) &&
                Objects.equals(machucvu, nhanvien.machucvu);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, tennhanvien, ngaysinh, gioitinh, diachi, sodienthoai, machucvu);
    }

    @OneToMany(mappedBy = "nhanvienByManhanvien")
    public Collection<ChamcongNhanvien> getChamcongNhanviensByManhanvien() {
        return chamcongNhanviensByManhanvien;
    }

    public void setChamcongNhanviensByManhanvien(Collection<ChamcongNhanvien> chamcongNhanviensByManhanvien) {
        this.chamcongNhanviensByManhanvien = chamcongNhanviensByManhanvien;
    }

    @OneToMany(mappedBy = "nhanvienByManhanvien")
    public Collection<Donduyethang> getDonduyethangsByManhanvien() {
        return donduyethangsByManhanvien;
    }

    public void setDonduyethangsByManhanvien(Collection<Donduyethang> donduyethangsByManhanvien) {
        this.donduyethangsByManhanvien = donduyethangsByManhanvien;
    }

    @OneToMany(mappedBy = "nhanvienByManhanvien")
    public Collection<KhenthuongNhanvien> getKhenthuongNhanviensByManhanvien() {
        return khenthuongNhanviensByManhanvien;
    }

    public void setKhenthuongNhanviensByManhanvien(Collection<KhenthuongNhanvien> khenthuongNhanviensByManhanvien) {
        this.khenthuongNhanviensByManhanvien = khenthuongNhanviensByManhanvien;
    }

    @OneToMany(mappedBy = "nhanvienByManhanvien")
    public Collection<KyluatNhanvien> getKyluatNhanviensByManhanvien() {
        return kyluatNhanviensByManhanvien;
    }

    public void setKyluatNhanviensByManhanvien(Collection<KyluatNhanvien> kyluatNhanviensByManhanvien) {
        this.kyluatNhanviensByManhanvien = kyluatNhanviensByManhanvien;
    }

    @OneToMany(mappedBy = "nhanvienByManhanvien")
    public Collection<LuongNhanvien> getLuongNhanviensByManhanvien() {
        return luongNhanviensByManhanvien;
    }

    public void setLuongNhanviensByManhanvien(Collection<LuongNhanvien> luongNhanviensByManhanvien) {
        this.luongNhanviensByManhanvien = luongNhanviensByManhanvien;
    }

    @ManyToOne
    @JoinColumn(name = "Machucvu", referencedColumnName = "Machucvu",insertable = false,updatable = false)
    public Chucvu getChucvuByMachucvu() {
        return chucvuByMachucvu;
    }

    public void setChucvuByMachucvu(Chucvu chucvuByMachucvu) {
        this.chucvuByMachucvu = chucvuByMachucvu;
    }

    @OneToMany(mappedBy = "nhanvienByManhanvien")
    public Collection<Phieunhapkho> getPhieunhapkhosByManhanvien() {
        return phieunhapkhosByManhanvien;
    }

    public void setPhieunhapkhosByManhanvien(Collection<Phieunhapkho> phieunhapkhosByManhanvien) {
        this.phieunhapkhosByManhanvien = phieunhapkhosByManhanvien;
    }

    @OneToOne(mappedBy="nhanvien")
	public TaiKhoan getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(TaiKhoan taikhoan) {
		this.taikhoan = taikhoan;
	}
    
}

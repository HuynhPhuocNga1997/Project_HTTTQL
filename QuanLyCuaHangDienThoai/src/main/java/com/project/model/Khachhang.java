package com.project.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Khachhang", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Khachhang {
    private String makhachhang;
    private String tenkhachhang;
    private Date ngaysinh;
    private String diachi;
    private String sochungminh;
    private String sodienthoai;
    private Collection<Hoadon> hoadonsByMakhachhang;

    @Id
    @Column(name = "Makhachhang")
    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    @Basic
    @Column(name = "Tenkhachhang")
    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
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
    @Column(name = "Diachi")
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Basic
    @Column(name = "Sochungminh")
    public String getSochungminh() {
        return sochungminh;
    }

    public void setSochungminh(String sochungminh) {
        this.sochungminh = sochungminh;
    }

    @Basic
    @Column(name = "Sodienthoai")
    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Khachhang khachhang = (Khachhang) o;
        return Objects.equals(makhachhang, khachhang.makhachhang) &&
                Objects.equals(tenkhachhang, khachhang.tenkhachhang) &&
                Objects.equals(ngaysinh, khachhang.ngaysinh) &&
                Objects.equals(diachi, khachhang.diachi) &&
                Objects.equals(sochungminh, khachhang.sochungminh) &&
                Objects.equals(sodienthoai, khachhang.sodienthoai);
    }

    @Override
    public int hashCode() {

        return Objects.hash(makhachhang, tenkhachhang, ngaysinh, diachi, sochungminh, sodienthoai);
    }

    @OneToMany(mappedBy = "khachhangByMakhachhang")
    public Collection<Hoadon> getHoadonsByMakhachhang() {
        return hoadonsByMakhachhang;
    }

    public void setHoadonsByMakhachhang(Collection<Hoadon> hoadonsByMakhachhang) {
        this.hoadonsByMakhachhang = hoadonsByMakhachhang;
    }
}

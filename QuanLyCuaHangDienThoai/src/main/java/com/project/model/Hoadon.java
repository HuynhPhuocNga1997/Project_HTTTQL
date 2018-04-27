package com.project.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Hoadon", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Hoadon {
    private String mahoadon;
    private Date ngaylaphoadon;
    private String manhanvien;
    private Double tongtien;
    private Integer tongsoluong;
    private String makhachhang;
    private Collection<Chitiethoadon> chitiethoadonsByMahoadon;
    private Khachhang khachhangByMakhachhang;

    @Id
    @Column(name = "Mahoadon")
    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    @Basic
    @Column(name = "Ngaylaphoadon")
    public Date getNgaylaphoadon() {
        return ngaylaphoadon;
    }

    public void setNgaylaphoadon(Date ngaylaphoadon) {
        this.ngaylaphoadon = ngaylaphoadon;
    }

    @Basic
    @Column(name = "Manhanvien")
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Basic
    @Column(name = "Tongtien")
    public Double getTongtien() {
        return tongtien;
    }

    public void setTongtien(Double tongtien) {
        this.tongtien = tongtien;
    }

    @Basic
    @Column(name = "Tongsoluong")
    public Integer getTongsoluong() {
        return tongsoluong;
    }

    public void setTongsoluong(Integer tongsoluong) {
        this.tongsoluong = tongsoluong;
    }

    @Basic
    @Column(name = "Makhachhang")
    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hoadon hoadon = (Hoadon) o;
        return Objects.equals(mahoadon, hoadon.mahoadon) &&
                Objects.equals(ngaylaphoadon, hoadon.ngaylaphoadon) &&
                Objects.equals(manhanvien, hoadon.manhanvien) &&
                Objects.equals(tongtien, hoadon.tongtien) &&
                Objects.equals(tongsoluong, hoadon.tongsoluong) &&
                Objects.equals(makhachhang, hoadon.makhachhang);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mahoadon, ngaylaphoadon, manhanvien, tongtien, tongsoluong, makhachhang);
    }

    @OneToMany(mappedBy = "hoadonByMahoadon")
    public Collection<Chitiethoadon> getChitiethoadonsByMahoadon() {
        return chitiethoadonsByMahoadon;
    }

    public void setChitiethoadonsByMahoadon(Collection<Chitiethoadon> chitiethoadonsByMahoadon) {
        this.chitiethoadonsByMahoadon = chitiethoadonsByMahoadon;
    }

    @ManyToOne
    @JoinColumn(name = "Makhachhang", referencedColumnName = "Makhachhang",insertable = false,updatable = false)
    public Khachhang getKhachhangByMakhachhang() {
        return khachhangByMakhachhang;
    }

    public void setKhachhangByMakhachhang(Khachhang khachhangByMakhachhang) {
        this.khachhangByMakhachhang = khachhangByMakhachhang;
    }
}

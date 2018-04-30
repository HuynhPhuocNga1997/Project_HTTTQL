package com.cochau.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Sanpham_Nhapkho", schema = "dbo", catalog = "quanlycuahangdienthoai")
@IdClass(SanphamNhapkhoPK.class)
public class SanphamNhapkho {
    private String masanpham;
    private String maphieunhapkho;
    private Integer soluong;
    private Double tonggia;
    private Sanpham sanphamByMasanpham;
    private Phieunhapkho phieunhapkhoByMaphieunhapkho;

    @Id
    @Column(name = "Masanpham")
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    @Id
    @Column(name = "Maphieunhapkho")
    public String getMaphieunhapkho() {
        return maphieunhapkho;
    }

    public void setMaphieunhapkho(String maphieunhapkho) {
        this.maphieunhapkho = maphieunhapkho;
    }

    @Basic
    @Column(name = "Soluong")
    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    @Basic
    @Column(name = "Tonggia")
    public Double getTonggia() {
        return tonggia;
    }

    public void setTonggia(Double tonggia) {
        this.tonggia = tonggia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanphamNhapkho that = (SanphamNhapkho) o;
        return Objects.equals(masanpham, that.masanpham) &&
                Objects.equals(maphieunhapkho, that.maphieunhapkho) &&
                Objects.equals(soluong, that.soluong) &&
                Objects.equals(tonggia, that.tonggia);
    }

    @Override
    public int hashCode() {

        return Objects.hash(masanpham, maphieunhapkho, soluong, tonggia);
    }

    @ManyToOne
    @JoinColumn(name = "Masanpham", referencedColumnName = "Masanpham", nullable = false,insertable = false,updatable = false)
    public Sanpham getSanphamByMasanpham() {
        return sanphamByMasanpham;
    }

    public void setSanphamByMasanpham(Sanpham sanphamByMasanpham) {
        this.sanphamByMasanpham = sanphamByMasanpham;
    }

    @ManyToOne
    @JoinColumn(name = "Maphieunhapkho", referencedColumnName = "Maphieunhapkho", nullable = false,insertable = false,updatable = false)
    public Phieunhapkho getPhieunhapkhoByMaphieunhapkho() {
        return phieunhapkhoByMaphieunhapkho;
    }

    public void setPhieunhapkhoByMaphieunhapkho(Phieunhapkho phieunhapkhoByMaphieunhapkho) {
        this.phieunhapkhoByMaphieunhapkho = phieunhapkhoByMaphieunhapkho;
    }
}

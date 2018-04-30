package com.cochau.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ChitiethoadonPK.class)
@Table(name = "Chitiethoadon", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Chitiethoadon {
    private String mahoadon;
    private String masanpham;
    private Integer soluong;
    private Hoadon hoadonByMahoadon;
    private Sanpham sanphamByMasanpham;

    @Id
    @Column(name = "Mahoadon")
    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    @Id
    @Column(name = "Masanpham")
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    @Basic
    @Column(name = "Soluong")
    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chitiethoadon that = (Chitiethoadon) o;
        return Objects.equals(mahoadon, that.mahoadon) &&
                Objects.equals(masanpham, that.masanpham) &&
                Objects.equals(soluong, that.soluong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mahoadon, masanpham, soluong);
    }

    @ManyToOne
    @JoinColumn(name = "Mahoadon", referencedColumnName = "Mahoadon", nullable = false,insertable = false,updatable = false)
    public Hoadon getHoadonByMahoadon() {
        return hoadonByMahoadon;
    }

    public void setHoadonByMahoadon(Hoadon hoadonByMahoadon) {
        this.hoadonByMahoadon = hoadonByMahoadon;
    }

    @ManyToOne
    @JoinColumn(name = "Masanpham", referencedColumnName = "Masanpham", nullable = false,insertable = false,updatable = false)
    public Sanpham getSanphamByMasanpham() {
        return sanphamByMasanpham;
    }

    public void setSanphamByMasanpham(Sanpham sanphamByMasanpham) {
        this.sanphamByMasanpham = sanphamByMasanpham;
    }
}

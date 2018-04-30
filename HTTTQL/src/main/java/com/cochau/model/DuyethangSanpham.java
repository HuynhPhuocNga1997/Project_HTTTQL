package com.cochau.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Duyethang_Sanpham", schema = "dbo", catalog = "quanlycuahangdienthoai")
@IdClass(DuyethangSanphamPK.class)
public class DuyethangSanpham {
    private String masanpham;
    private String madonduyethang;
    private Integer soluong;
    private Sanpham sanphamByMasanpham;
    private Donduyethang donduyethangByMadonduyethang;

    @Id
    @Column(name = "Masanpham")
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    @Id
    @Column(name = "Madonduyethang")
    public String getMadonduyethang() {
        return madonduyethang;
    }

    public void setMadonduyethang(String madonduyethang) {
        this.madonduyethang = madonduyethang;
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
        DuyethangSanpham that = (DuyethangSanpham) o;
        return Objects.equals(masanpham, that.masanpham) &&
                Objects.equals(madonduyethang, that.madonduyethang) &&
                Objects.equals(soluong, that.soluong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(masanpham, madonduyethang, soluong);
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
    @JoinColumn(name = "Madonduyethang", referencedColumnName = "Madonduyethang", nullable = false,insertable = false,updatable = false)
    public Donduyethang getDonduyethangByMadonduyethang() {
        return donduyethangByMadonduyethang;
    }

    public void setDonduyethangByMadonduyethang(Donduyethang donduyethangByMadonduyethang) {
        this.donduyethangByMadonduyethang = donduyethangByMadonduyethang;
    }
}

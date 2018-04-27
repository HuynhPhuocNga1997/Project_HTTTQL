package com.project.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Donduyethang", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Donduyethang {
    private String madonduyethang;
    private Date ngaylap;
    private String manhanvien;
    private Integer tongsoluong;
    private Double tonggiatri;
    private Nhanvien nhanvienByManhanvien;
    private Collection<DuyethangSanpham> duyethangSanphamsByMadonduyethang;

    @Id
    @Column(name = "Madonduyethang")
    public String getMadonduyethang() {
        return madonduyethang;
    }

    public void setMadonduyethang(String madonduyethang) {
        this.madonduyethang = madonduyethang;
    }

    @Basic
    @Column(name = "Ngaylap")
    public Date getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
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
    @Column(name = "Tongsoluong")
    public Integer getTongsoluong() {
        return tongsoluong;
    }

    public void setTongsoluong(Integer tongsoluong) {
        this.tongsoluong = tongsoluong;
    }

    @Basic
    @Column(name = "Tonggiatri")
    public Double getTonggiatri() {
        return tonggiatri;
    }

    public void setTonggiatri(Double tonggiatri) {
        this.tonggiatri = tonggiatri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donduyethang that = (Donduyethang) o;
        return Objects.equals(madonduyethang, that.madonduyethang) &&
                Objects.equals(ngaylap, that.ngaylap) &&
                Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(tongsoluong, that.tongsoluong) &&
                Objects.equals(tonggiatri, that.tonggiatri);
    }

    @Override
    public int hashCode() {

        return Objects.hash(madonduyethang, ngaylap, manhanvien, tongsoluong, tonggiatri);
    }

    @ManyToOne
    @JoinColumn(name = "Manhanvien", referencedColumnName = "Manhanvien",insertable = false,updatable = false)
    public Nhanvien getNhanvienByManhanvien() {
        return nhanvienByManhanvien;
    }

    public void setNhanvienByManhanvien(Nhanvien nhanvienByManhanvien) {
        this.nhanvienByManhanvien = nhanvienByManhanvien;
    }

    @OneToMany(mappedBy = "donduyethangByMadonduyethang")
    public Collection<DuyethangSanpham> getDuyethangSanphamsByMadonduyethang() {
        return duyethangSanphamsByMadonduyethang;
    }

    public void setDuyethangSanphamsByMadonduyethang(Collection<DuyethangSanpham> duyethangSanphamsByMadonduyethang) {
        this.duyethangSanphamsByMadonduyethang = duyethangSanphamsByMadonduyethang;
    }
}

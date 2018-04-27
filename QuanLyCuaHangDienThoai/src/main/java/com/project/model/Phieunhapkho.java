package com.project.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Phieunhapkho", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Phieunhapkho {
    private String maphieunhapkho;
    private Date ngaynhapkho;
    private String manhanvien;
    private Integer tongsoluong;
    private Double tonggiatri;
    private Nhanvien nhanvienByManhanvien;
    private Collection<SanphamNhapkho> sanphamNhapkhosByMaphieunhapkho;

    @Id
    @Column(name = "Maphieunhapkho")
    public String getMaphieunhapkho() {
        return maphieunhapkho;
    }

    public void setMaphieunhapkho(String maphieunhapkho) {
        this.maphieunhapkho = maphieunhapkho;
    }

    @Basic
    @Column(name = "Ngaynhapkho")
    public Date getNgaynhapkho() {
        return ngaynhapkho;
    }

    public void setNgaynhapkho(Date ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
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
        Phieunhapkho that = (Phieunhapkho) o;
        return Objects.equals(maphieunhapkho, that.maphieunhapkho) &&
                Objects.equals(ngaynhapkho, that.ngaynhapkho) &&
                Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(tongsoluong, that.tongsoluong) &&
                Objects.equals(tonggiatri, that.tonggiatri);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maphieunhapkho, ngaynhapkho, manhanvien, tongsoluong, tonggiatri);
    }

    @ManyToOne
    @JoinColumn(name = "Manhanvien", referencedColumnName = "Manhanvien",insertable = false,updatable = false)
    public Nhanvien getNhanvienByManhanvien() {
        return nhanvienByManhanvien;
    }

    public void setNhanvienByManhanvien(Nhanvien nhanvienByManhanvien) {
        this.nhanvienByManhanvien = nhanvienByManhanvien;
    }

    @OneToMany(mappedBy = "phieunhapkhoByMaphieunhapkho")
    public Collection<SanphamNhapkho> getSanphamNhapkhosByMaphieunhapkho() {
        return sanphamNhapkhosByMaphieunhapkho;
    }

    public void setSanphamNhapkhosByMaphieunhapkho(Collection<SanphamNhapkho> sanphamNhapkhosByMaphieunhapkho) {
        this.sanphamNhapkhosByMaphieunhapkho = sanphamNhapkhosByMaphieunhapkho;
    }
}

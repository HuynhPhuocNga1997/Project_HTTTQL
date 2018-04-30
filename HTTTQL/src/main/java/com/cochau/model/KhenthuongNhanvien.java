package com.cochau.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Khenthuong_Nhanvien", schema = "dbo", catalog = "quanlycuahangdienthoai")
@IdClass(KhenthuongNhanvienPK.class)
public class KhenthuongNhanvien {
    private String manhanvien;
    private String makhenthuong;
    private Date ngaykhenthuong;
    private Nhanvien nhanvienByManhanvien;
    private Khenthuong khenthuongByMakhenthuong;

    @Id
    @Column(name = "Manhanvien")
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Id
    @Column(name = "Makhenthuong")
    public String getMakhenthuong() {
        return makhenthuong;
    }

    public void setMakhenthuong(String makhenthuong) {
        this.makhenthuong = makhenthuong;
    }

    @Basic
    @Column(name = "Ngaykhenthuong")
    public Date getNgaykhenthuong() {
        return ngaykhenthuong;
    }

    public void setNgaykhenthuong(Date ngaykhenthuong) {
        this.ngaykhenthuong = ngaykhenthuong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhenthuongNhanvien that = (KhenthuongNhanvien) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(makhenthuong, that.makhenthuong) &&
                Objects.equals(ngaykhenthuong, that.ngaykhenthuong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, makhenthuong, ngaykhenthuong);
    }

    @ManyToOne
    @JoinColumn(name = "Manhanvien", referencedColumnName = "Manhanvien", nullable = false,insertable = false,updatable = false)
    public Nhanvien getNhanvienByManhanvien() {
        return nhanvienByManhanvien;
    }

    public void setNhanvienByManhanvien(Nhanvien nhanvienByManhanvien) {
        this.nhanvienByManhanvien = nhanvienByManhanvien;
    }

    @ManyToOne
    @JoinColumn(name = "Makhenthuong", referencedColumnName = "Makhenthuong", nullable = false,insertable = false,updatable = false)
    public Khenthuong getKhenthuongByMakhenthuong() {
        return khenthuongByMakhenthuong;
    }

    public void setKhenthuongByMakhenthuong(Khenthuong khenthuongByMakhenthuong) {
        this.khenthuongByMakhenthuong = khenthuongByMakhenthuong;
    }
}

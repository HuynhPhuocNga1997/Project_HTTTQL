package com.cochau.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Khenthuong", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Khenthuong {
    private String makhenthuong;
    private String tenkhenthuong;
    private String lydokhenthuong;
    private String hinhthuckhenthuong;
    private Collection<KhenthuongNhanvien> khenthuongNhanviensByMakhenthuong;

    @Id
    @Column(name = "Makhenthuong")
    public String getMakhenthuong() {
        return makhenthuong;
    }

    public void setMakhenthuong(String makhenthuong) {
        this.makhenthuong = makhenthuong;
    }

    @Basic
    @Column(name = "Tenkhenthuong")
    public String getTenkhenthuong() {
        return tenkhenthuong;
    }

    public void setTenkhenthuong(String tenkhenthuong) {
        this.tenkhenthuong = tenkhenthuong;
    }

    @Basic
    @Column(name = "Lydokhenthuong")
    public String getLydokhenthuong() {
        return lydokhenthuong;
    }

    public void setLydokhenthuong(String lydokhenthuong) {
        this.lydokhenthuong = lydokhenthuong;
    }

    @Basic
    @Column(name = "Hinhthuckhenthuong")
    public String getHinhthuckhenthuong() {
        return hinhthuckhenthuong;
    }

    public void setHinhthuckhenthuong(String hinhthuckhenthuong) {
        this.hinhthuckhenthuong = hinhthuckhenthuong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Khenthuong that = (Khenthuong) o;
        return Objects.equals(makhenthuong, that.makhenthuong) &&
                Objects.equals(tenkhenthuong, that.tenkhenthuong) &&
                Objects.equals(lydokhenthuong, that.lydokhenthuong) &&
                Objects.equals(hinhthuckhenthuong, that.hinhthuckhenthuong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(makhenthuong, tenkhenthuong, lydokhenthuong, hinhthuckhenthuong);
    }

    @OneToMany(mappedBy = "khenthuongByMakhenthuong")
    public Collection<KhenthuongNhanvien> getKhenthuongNhanviensByMakhenthuong() {
        return khenthuongNhanviensByMakhenthuong;
    }

    public void setKhenthuongNhanviensByMakhenthuong(Collection<KhenthuongNhanvien> khenthuongNhanviensByMakhenthuong) {
        this.khenthuongNhanviensByMakhenthuong = khenthuongNhanviensByMakhenthuong;
    }
}

package com.cochau.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class KhenthuongNhanvienPK implements Serializable {
    private String manhanvien;
    private String makhenthuong;

    @Column(name = "Manhanvien")
    @Id
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Column(name = "Makhenthuong")
    @Id
    public String getMakhenthuong() {
        return makhenthuong;
    }

    public void setMakhenthuong(String makhenthuong) {
        this.makhenthuong = makhenthuong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KhenthuongNhanvienPK that = (KhenthuongNhanvienPK) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(makhenthuong, that.makhenthuong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, makhenthuong);
    }
}

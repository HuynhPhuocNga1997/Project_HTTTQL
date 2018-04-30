package com.cochau.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Luong_Nhanvien", schema = "dbo", catalog = "quanlycuahangdienthoai")
@IdClass(LuongNhanvienPK.class)
public class LuongNhanvien {
    private String manhanvien;
    private Date thangtrongnam;
    private Double tongluong;
    private Nhanvien nhanvienByManhanvien;

    @Id
    @Column(name = "Manhanvien")
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Id
    @Column(name = "Thangtrongnam")
    public Date getThangtrongnam() {
        return thangtrongnam;
    }

    public void setThangtrongnam(Date thangtrongnam) {
        this.thangtrongnam = thangtrongnam;
    }

    @Basic
    @Column(name = "Tongluong")
    public Double getTongluong() {
        return tongluong;
    }

    public void setTongluong(Double tongluong) {
        this.tongluong = tongluong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LuongNhanvien that = (LuongNhanvien) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(thangtrongnam, that.thangtrongnam) &&
                Objects.equals(tongluong, that.tongluong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, thangtrongnam, tongluong);
    }

    @ManyToOne
    @JoinColumn(name = "Manhanvien", referencedColumnName = "Manhanvien", nullable = false,insertable = false,updatable = false)
    public Nhanvien getNhanvienByManhanvien() {
        return nhanvienByManhanvien;
    }

    public void setNhanvienByManhanvien(Nhanvien nhanvienByManhanvien) {
        this.nhanvienByManhanvien = nhanvienByManhanvien;
    }
}

package com.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class LuongNhanvienPK implements Serializable {
    private String manhanvien;
    private Date thangtrongnam;

    @Column(name = "Manhanvien")
    @Id
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Column(name = "Thangtrongnam")
    @Id
    public Date getThangtrongnam() {
        return thangtrongnam;
    }

    public void setThangtrongnam(Date thangtrongnam) {
        this.thangtrongnam = thangtrongnam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LuongNhanvienPK that = (LuongNhanvienPK) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(thangtrongnam, that.thangtrongnam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, thangtrongnam);
    }
}

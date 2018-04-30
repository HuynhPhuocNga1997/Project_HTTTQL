package com.cochau.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ChamcongNhanvienPK implements Serializable {
    private String manhanvien;
    private String matrangthai;

    @Column(name = "Manhanvien")
    @Id
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Column(name = "Matrangthai")
    @Id
    public String getMatrangthai() {
        return matrangthai;
    }

    public void setMatrangthai(String matrangthai) {
        this.matrangthai = matrangthai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChamcongNhanvienPK that = (ChamcongNhanvienPK) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(matrangthai, that.matrangthai);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, matrangthai);
    }
}

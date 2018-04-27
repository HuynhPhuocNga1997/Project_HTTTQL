package com.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class KyluatNhanvienPK implements Serializable {
    private String manhanvien;
    private String makyluat;

    @Column(name = "Manhanvien")
    @Id
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Column(name = "Makyluat")
    @Id
    public String getMakyluat() {
        return makyluat;
    }

    public void setMakyluat(String makyluat) {
        this.makyluat = makyluat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KyluatNhanvienPK that = (KyluatNhanvienPK) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(makyluat, that.makyluat);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, makyluat);
    }
}

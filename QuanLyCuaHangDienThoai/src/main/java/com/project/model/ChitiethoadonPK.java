package com.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ChitiethoadonPK implements Serializable {
    private String mahoadon;
    private String masanpham;

    @Column(name = "Mahoadon")
    @Id
    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    @Column(name = "Masanpham")
    @Id
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChitiethoadonPK that = (ChitiethoadonPK) o;
        return Objects.equals(mahoadon, that.mahoadon) &&
                Objects.equals(masanpham, that.masanpham);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mahoadon, masanpham);
    }
}

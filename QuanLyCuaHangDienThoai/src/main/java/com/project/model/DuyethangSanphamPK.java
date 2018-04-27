package com.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DuyethangSanphamPK implements Serializable {
    private String masanpham;
    private String madonduyethang;

    @Column(name = "Masanpham")
    @Id
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    @Column(name = "Madonduyethang")
    @Id
    public String getMadonduyethang() {
        return madonduyethang;
    }

    public void setMadonduyethang(String madonduyethang) {
        this.madonduyethang = madonduyethang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuyethangSanphamPK that = (DuyethangSanphamPK) o;
        return Objects.equals(masanpham, that.masanpham) &&
                Objects.equals(madonduyethang, that.madonduyethang);
    }

    @Override
    public int hashCode() {

        return Objects.hash(masanpham, madonduyethang);
    }
}

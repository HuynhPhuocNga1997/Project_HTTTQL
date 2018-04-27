package com.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SanphamNhapkhoPK implements Serializable {
    private String masanpham;
    private String maphieunhapkho;

    @Column(name = "Masanpham")
    @Id
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    @Column(name = "Maphieunhapkho")
    @Id
    public String getMaphieunhapkho() {
        return maphieunhapkho;
    }

    public void setMaphieunhapkho(String maphieunhapkho) {
        this.maphieunhapkho = maphieunhapkho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanphamNhapkhoPK that = (SanphamNhapkhoPK) o;
        return Objects.equals(masanpham, that.masanpham) &&
                Objects.equals(maphieunhapkho, that.maphieunhapkho);
    }

    @Override
    public int hashCode() {

        return Objects.hash(masanpham, maphieunhapkho);
    }
}

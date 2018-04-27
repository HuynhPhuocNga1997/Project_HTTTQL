package com.project.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Tinh_Trang_Nhan_Vien", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class TinhTrangNhanVien {
    private String matrangthai;
    private String trangthai;
    private Double phantramluongtru;
    private Collection<ChamcongNhanvien> chamcongNhanviensByMatrangthai;

    @Id
    @Column(name = "Matrangthai")
    public String getMatrangthai() {
        return matrangthai;
    }

    public void setMatrangthai(String matrangthai) {
        this.matrangthai = matrangthai;
    }

    @Basic
    @Column(name = "Trangthai")
    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Basic
    @Column(name = "Phantramluongtru")
    public Double getPhantramluongtru() {
        return phantramluongtru;
    }

    public void setPhantramluongtru(Double phantramluongtru) {
        this.phantramluongtru = phantramluongtru;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TinhTrangNhanVien that = (TinhTrangNhanVien) o;
        return Objects.equals(matrangthai, that.matrangthai) &&
                Objects.equals(trangthai, that.trangthai) &&
                Objects.equals(phantramluongtru, that.phantramluongtru);
    }

    @Override
    public int hashCode() {

        return Objects.hash(matrangthai, trangthai, phantramluongtru);
    }

    @OneToMany(mappedBy = "tinhTrangNhanVienByMatrangthai")
    public Collection<ChamcongNhanvien> getChamcongNhanviensByMatrangthai() {
        return chamcongNhanviensByMatrangthai;
    }

    public void setChamcongNhanviensByMatrangthai(Collection<ChamcongNhanvien> chamcongNhanviensByMatrangthai) {
        this.chamcongNhanviensByMatrangthai = chamcongNhanviensByMatrangthai;
    }
}

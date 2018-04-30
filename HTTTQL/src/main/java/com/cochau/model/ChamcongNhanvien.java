package com.cochau.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Chamcong_Nhanvien", schema = "dbo", catalog = "quanlycuahangdienthoai")
@IdClass(ChamcongNhanvienPK.class)
public class ChamcongNhanvien {
    private String manhanvien;
    private String matrangthai;
    private Date ngaychamcong;
    private Nhanvien nhanvienByManhanvien;
    private TinhTrangNhanVien tinhTrangNhanVienByMatrangthai;

    @Id
    @Column(name = "Manhanvien")
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Id
    @Column(name = "Matrangthai")
    public String getMatrangthai() {
        return matrangthai;
    }

    public void setMatrangthai(String matrangthai) {
        this.matrangthai = matrangthai;
    }

    @Basic
    @Column(name = "Ngaychamcong")
    public Date getNgaychamcong() {
        return ngaychamcong;
    }

    public void setNgaychamcong(Date ngaychamcong) {
        this.ngaychamcong = ngaychamcong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChamcongNhanvien that = (ChamcongNhanvien) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(matrangthai, that.matrangthai) &&
                Objects.equals(ngaychamcong, that.ngaychamcong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, matrangthai, ngaychamcong);
    }

    @ManyToOne
    @JoinColumn(name = "Manhanvien", referencedColumnName = "Manhanvien", nullable = false,insertable = false,updatable = false)
    public Nhanvien getNhanvienByManhanvien() {
        return nhanvienByManhanvien;
    }

    public void setNhanvienByManhanvien(Nhanvien nhanvienByManhanvien) {
        this.nhanvienByManhanvien = nhanvienByManhanvien;
    }

    @ManyToOne
    @JoinColumn(name = "Matrangthai", referencedColumnName = "Matrangthai", nullable = false,insertable = false,updatable = false)
    public TinhTrangNhanVien getTinhTrangNhanVienByMatrangthai() {
        return tinhTrangNhanVienByMatrangthai;
    }

    public void setTinhTrangNhanVienByMatrangthai(TinhTrangNhanVien tinhTrangNhanVienByMatrangthai) {
        this.tinhTrangNhanVienByMatrangthai = tinhTrangNhanVienByMatrangthai;
    }
}

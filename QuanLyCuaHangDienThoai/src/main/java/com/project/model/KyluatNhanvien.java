package com.project.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Kyluat_Nhanvien", schema = "dbo", catalog = "quanlycuahangdienthoai")
@IdClass(KyluatNhanvienPK.class)
public class KyluatNhanvien {
    private String manhanvien;
    private String makyluat;
    private Date ngaykyluat;
    private Nhanvien nhanvienByManhanvien;
    private Kyluat kyluatByMakyluat;

    @Id
    @Column(name = "Manhanvien")
    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Id
    @Column(name = "Makyluat")
    public String getMakyluat() {
        return makyluat;
    }

    public void setMakyluat(String makyluat) {
        this.makyluat = makyluat;
    }

    @Basic
    @Column(name = "Ngaykyluat")
    public Date getNgaykyluat() {
        return ngaykyluat;
    }

    public void setNgaykyluat(Date ngaykyluat) {
        this.ngaykyluat = ngaykyluat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KyluatNhanvien that = (KyluatNhanvien) o;
        return Objects.equals(manhanvien, that.manhanvien) &&
                Objects.equals(makyluat, that.makyluat) &&
                Objects.equals(ngaykyluat, that.ngaykyluat);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhanvien, makyluat, ngaykyluat);
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
    @JoinColumn(name = "Makyluat", referencedColumnName = "Makyluat", nullable = false,insertable = false,updatable = false)
    public Kyluat getKyluatByMakyluat() {
        return kyluatByMakyluat;
    }

    public void setKyluatByMakyluat(Kyluat kyluatByMakyluat) {
        this.kyluatByMakyluat = kyluatByMakyluat;
    }
}

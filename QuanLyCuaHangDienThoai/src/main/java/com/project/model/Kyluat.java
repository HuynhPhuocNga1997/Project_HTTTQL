package com.project.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Kyluat", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Kyluat {
    private String makyluat;
    private String tenkyluat;
    private String lydokyluat;
    private String mucdo;
    private Collection<KyluatNhanvien> kyluatNhanviensByMakyluat;

    @Id
    @Column(name = "Makyluat")
    public String getMakyluat() {
        return makyluat;
    }

    public void setMakyluat(String makyluat) {
        this.makyluat = makyluat;
    }

    @Basic
    @Column(name = "Tenkyluat")
    public String getTenkyluat() {
        return tenkyluat;
    }

    public void setTenkyluat(String tenkyluat) {
        this.tenkyluat = tenkyluat;
    }

    @Basic
    @Column(name = "Lydokyluat")
    public String getLydokyluat() {
        return lydokyluat;
    }

    public void setLydokyluat(String lydokyluat) {
        this.lydokyluat = lydokyluat;
    }

    @Basic
    @Column(name = "Mucdo")
    public String getMucdo() {
        return mucdo;
    }

    public void setMucdo(String mucdo) {
        this.mucdo = mucdo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kyluat kyluat = (Kyluat) o;
        return Objects.equals(makyluat, kyluat.makyluat) &&
                Objects.equals(tenkyluat, kyluat.tenkyluat) &&
                Objects.equals(lydokyluat, kyluat.lydokyluat) &&
                Objects.equals(mucdo, kyluat.mucdo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(makyluat, tenkyluat, lydokyluat, mucdo);
    }

    @OneToMany(mappedBy = "kyluatByMakyluat")
    public Collection<KyluatNhanvien> getKyluatNhanviensByMakyluat() {
        return kyluatNhanviensByMakyluat;
    }

    public void setKyluatNhanviensByMakyluat(Collection<KyluatNhanvien> kyluatNhanviensByMakyluat) {
        this.kyluatNhanviensByMakyluat = kyluatNhanviensByMakyluat;
    }
}

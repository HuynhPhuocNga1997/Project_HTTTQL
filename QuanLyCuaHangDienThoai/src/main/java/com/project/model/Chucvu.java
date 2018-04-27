package com.project.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Chucvu", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Chucvu {
    private String machucvu;
    private String tenchucvu;
    private String capbac;
    private Double luong;
    private Collection<Nhanvien> nhanviensByMachucvu;

    @Id
    @Column(name = "Machucvu")
    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    @Basic
    @Column(name = "Tenchucvu")
    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    @Basic
    @Column(name = "Capbac")
    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    @Basic
    @Column(name = "Luong")
    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chucvu chucvu = (Chucvu) o;
        return Objects.equals(machucvu, chucvu.machucvu) &&
                Objects.equals(tenchucvu, chucvu.tenchucvu) &&
                Objects.equals(capbac, chucvu.capbac) &&
                Objects.equals(luong, chucvu.luong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(machucvu, tenchucvu, capbac, luong);
    }

    @OneToMany(mappedBy = "chucvuByMachucvu")
    public Collection<Nhanvien> getNhanviensByMachucvu() {
        return nhanviensByMachucvu;
    }

    public void setNhanviensByMachucvu(Collection<Nhanvien> nhanviensByMachucvu) {
        this.nhanviensByMachucvu = nhanviensByMachucvu;
    }
}

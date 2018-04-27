package com.project.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Nhacungcap", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Nhacungcap {
    private String manhacungcap;
    private String tennhacungcap;
    private String diachi;
    private String sodienthoai;
    private Collection<Sanpham> sanphamsByManhacungcap;

    @Id
    @Column(name = "Manhacungcap")
    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    @Basic
    @Column(name = "Tennhacungcap")
    public String getTennhacungcap() {
        return tennhacungcap;
    }

    public void setTennhacungcap(String tennhacungcap) {
        this.tennhacungcap = tennhacungcap;
    }

    @Basic
    @Column(name = "Diachi")
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Basic
    @Column(name = "Sodienthoai")
    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nhacungcap that = (Nhacungcap) o;
        return Objects.equals(manhacungcap, that.manhacungcap) &&
                Objects.equals(tennhacungcap, that.tennhacungcap) &&
                Objects.equals(diachi, that.diachi) &&
                Objects.equals(sodienthoai, that.sodienthoai);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manhacungcap, tennhacungcap, diachi, sodienthoai);
    }

    @OneToMany(mappedBy = "nhacungcapByManhacungcap")
    public Collection<Sanpham> getSanphamsByManhacungcap() {
        return sanphamsByManhacungcap;
    }

    public void setSanphamsByManhacungcap(Collection<Sanpham> sanphamsByManhacungcap) {
        this.sanphamsByManhacungcap = sanphamsByManhacungcap;
    }
}

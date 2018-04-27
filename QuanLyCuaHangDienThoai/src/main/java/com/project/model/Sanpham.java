package com.project.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Sanpham", schema = "dbo", catalog = "quanlycuahangdienthoai")
public class Sanpham {
    private String masanpham;
    private String tensanpham;
    private Integer soluong;
    private String mausac;
    private String camaratruoc;
    private String camarasau;
    private String bonho;
    private String hedieuhanh;
    private String pin;
    private Double giaban;
    private String thoigianbaohanh;
    private String manhacungcap;
    private Collection<Chitiethoadon> chitiethoadonsByMasanpham;
    private Collection<DuyethangSanpham> duyethangSanphamsByMasanpham;
    private Nhacungcap nhacungcapByManhacungcap;
    private Collection<SanphamNhapkho> sanphamNhapkhosByMasanpham;

    @Id
    @Column(name = "Masanpham")
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    @Basic
    @Column(name = "Tensanpham")
    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    @Basic
    @Column(name = "Soluong")
    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    @Basic
    @Column(name = "Mausac")
    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    @Basic
    @Column(name = "Camaratruoc")
    public String getCamaratruoc() {
        return camaratruoc;
    }

    public void setCamaratruoc(String camaratruoc) {
        this.camaratruoc = camaratruoc;
    }

    @Basic
    @Column(name = "Camarasau")
    public String getCamarasau() {
        return camarasau;
    }

    public void setCamarasau(String camarasau) {
        this.camarasau = camarasau;
    }

    @Basic
    @Column(name = "Bonho")
    public String getBonho() {
        return bonho;
    }

    public void setBonho(String bonho) {
        this.bonho = bonho;
    }

    @Basic
    @Column(name = "Hedieuhanh")
    public String getHedieuhanh() {
        return hedieuhanh;
    }

    public void setHedieuhanh(String hedieuhanh) {
        this.hedieuhanh = hedieuhanh;
    }

    @Basic
    @Column(name = "Pin")
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Basic
    @Column(name = "Giaban")
    public Double getGiaban() {
        return giaban;
    }

    public void setGiaban(Double giaban) {
        this.giaban = giaban;
    }

    @Basic
    @Column(name = "Thoigianbaohanh")
    public String getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setThoigianbaohanh(String thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }

    @Basic
    @Column(name = "Manhacungcap")
    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanpham sanpham = (Sanpham) o;
        return Objects.equals(masanpham, sanpham.masanpham) &&
                Objects.equals(tensanpham, sanpham.tensanpham) &&
                Objects.equals(soluong, sanpham.soluong) &&
                Objects.equals(mausac, sanpham.mausac) &&
                Objects.equals(camaratruoc, sanpham.camaratruoc) &&
                Objects.equals(camarasau, sanpham.camarasau) &&
                Objects.equals(bonho, sanpham.bonho) &&
                Objects.equals(hedieuhanh, sanpham.hedieuhanh) &&
                Objects.equals(pin, sanpham.pin) &&
                Objects.equals(giaban, sanpham.giaban) &&
                Objects.equals(thoigianbaohanh, sanpham.thoigianbaohanh) &&
                Objects.equals(manhacungcap, sanpham.manhacungcap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(masanpham, tensanpham, soluong, mausac, camaratruoc, camarasau, bonho, hedieuhanh, pin, giaban, thoigianbaohanh, manhacungcap);
    }

    @OneToMany(mappedBy = "sanphamByMasanpham")
    public Collection<Chitiethoadon> getChitiethoadonsByMasanpham() {
        return chitiethoadonsByMasanpham;
    }

    public void setChitiethoadonsByMasanpham(Collection<Chitiethoadon> chitiethoadonsByMasanpham) {
        this.chitiethoadonsByMasanpham = chitiethoadonsByMasanpham;
    }

    @OneToMany(mappedBy = "sanphamByMasanpham")
    public Collection<DuyethangSanpham> getDuyethangSanphamsByMasanpham() {
        return duyethangSanphamsByMasanpham;
    }

    public void setDuyethangSanphamsByMasanpham(Collection<DuyethangSanpham> duyethangSanphamsByMasanpham) {
        this.duyethangSanphamsByMasanpham = duyethangSanphamsByMasanpham;
    }

    @ManyToOne
    @JoinColumn(name = "Manhacungcap", referencedColumnName = "Manhacungcap",insertable = false,updatable = false)
    public Nhacungcap getNhacungcapByManhacungcap() {
        return nhacungcapByManhacungcap;
    }

    public void setNhacungcapByManhacungcap(Nhacungcap nhacungcapByManhacungcap) {
        this.nhacungcapByManhacungcap = nhacungcapByManhacungcap;
    }

    @OneToMany(mappedBy = "sanphamByMasanpham")
    public Collection<SanphamNhapkho> getSanphamNhapkhosByMasanpham() {
        return sanphamNhapkhosByMasanpham;
    }

    public void setSanphamNhapkhosByMasanpham(Collection<SanphamNhapkho> sanphamNhapkhosByMasanpham) {
        this.sanphamNhapkhosByMasanpham = sanphamNhapkhosByMasanpham;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang;

import java.io.Serializable;

/**
 *
 * @author hocvien
 */
public class KhachHang implements Serializable{

    private int soCMND;
    private String hoVaTenDem;
    private String ten;
    private String diaChi;
    private int soDienThoai;

    public KhachHang(int soCMND, String hoVaTenDem, String ten, String diaChi, int soDienThoai) {
        this.soCMND = soCMND;
        this.hoVaTenDem = hoVaTenDem;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public String getHoVaTenDem() {
        return hoVaTenDem;
    }

    public void setHoVaTenDem(String hoVaTenDem) {
        this.hoVaTenDem = hoVaTenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}

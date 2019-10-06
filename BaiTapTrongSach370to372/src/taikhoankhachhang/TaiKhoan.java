/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taikhoankhachhang;

/**
 *
 * @author legen
 */
public class TaiKhoan {
    private long soTaiKhoan;
    private String matKhau;
    private KhachHang kh;
    private double soDuTaiKhoan;

    public TaiKhoan() {
    }

    public TaiKhoan(long soTaiKhoan, String matKhau, KhachHang kh, double soDuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.matKhau = matKhau;
        this.kh = kh;
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public double getSoDuTaiKhoan() {
        return soDuTaiKhoan;
    }

    public void setSoDuTaiKhoan(double soDuTaiKhoan) {
        this.soDuTaiKhoan = soDuTaiKhoan;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taikhoankhachhang;

import java.util.Scanner;

/**
 *
 * @author legen
 */
public class KhachHang {
    private String hoTen;
    private String diaChi;
    private long soDienThoai;
    private String email;
    private static Scanner scanner = new Scanner(System.in);
    
    public KhachHang() {
    }

    public KhachHang(String hoTen, String diaChi, long soDienThoai, String email) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }
    
    public void Nhap(){
        System.out.println("Nhap ho va ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        this.soDienThoai = Long.parseLong(scanner.nextLine());
        System.out.println("Nhap email: ");
        this.email = scanner.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Dien thoai: " + this.soDienThoai);
        System.out.println("Email: " + this.email);
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public long getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(long soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

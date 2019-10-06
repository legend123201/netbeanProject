/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanghoa;

import java.util.Scanner;

/**
 *
 * @author legen
 */
public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected long donGia;

    protected static Scanner scanner = new Scanner(System.in);
    
    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    
    public void Nhap(){
        System.out.println("Nhap ma hang: ");
        this.maHang = scanner.nextLine();
        System.out.println("Nhap ten hang: ");
        this.tenHang = scanner.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = Long.parseLong(scanner.nextLine());
    }
    
    public void Xuat(){
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Don gia: " + donGia);
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
}



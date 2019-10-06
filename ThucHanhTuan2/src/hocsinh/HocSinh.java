/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocsinh;

import java.util.Scanner;

/**
 *
 * @author legen
 */
public class HocSinh {

    private int maSo;
    private String hoTen;
    private float diemTrungBinh;
    public static Scanner scanner = new Scanner(System.in);

    public HocSinh() {

    }

    public HocSinh(int maSo, String hoTen, float diemTrungBinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void Input() {

        System.out.print("Nhap ma so: ");
        this.maSo = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        this.diemTrungBinh = Float.parseFloat(scanner.nextLine());
        System.out.println("--------------------------");
    }

    public void rank(){
        System.out.print("Xep loai:");
        if(this.diemTrungBinh < 5){
            System.out.println(" Hoc sinh yeu");
        }else if(this.diemTrungBinh < 6.5){
            System.out.println(" Hoc sinh trung binh");
        }else if(this.diemTrungBinh < 8){
            System.out.println(" Hoc sinh kha");
        }else {
            System.out.println(" Hoc sinh gioi");
        }
    }
    
    public void Show() {
        System.out.println("--------------------------");
        System.out.println("Ma so: " + this.maSo);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Diem trung binh: " + this.diemTrungBinh);
        rank();
    }
}

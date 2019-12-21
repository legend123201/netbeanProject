/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethinam2018.Structure;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author legen
 */
public class Sach implements Serializable{

    private static int maSachBatDau;
    private int maSach;
    private String tenSach;
    private String tacGia;
    private ChuyenNganh chuyenNganh;
    private int namXuatBan;
    private int soLuong;

    public Sach(String tenSach, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSachBatDau++;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        ChonChuyenNganh();
    }

    public Sach() {
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static int getMaSachBatDau() {
        return maSachBatDau;
    }

    public static void setMaSachBatDau(int maSachBatDau) {
        Sach.maSachBatDau = maSachBatDau;
    }

    private void ChonChuyenNganh() {
        ChuyenNganh cN[] = ChuyenNganh.values();
        int luaChon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap chuyen nganh cua sach: ");
            int i = 1;
            for (ChuyenNganh cn : cN) {
                System.out.println(i++ + ". " + cn.getValue());
            }
            System.out.print("Chon chuyen nganh: ");
            luaChon = Integer.parseInt(scanner.nextLine());
            if (luaChon < 1 || luaChon > 4) {
                System.out.println("Lua chon khong hop le! Moi nhap lai!");
            } else {
                this.chuyenNganh = cN[luaChon - 1];
                return;
            }
        }
    }

    private enum ChuyenNganh {

        KhoaHocTuNhien("Khoa Hoc Tu Nhien"),
        VanHocNgheThuat("Van Hoc - Nghe Thuat"),
        DienTuVienThong("Dien Tu Vien Thong"),
        CongNgheThongTin("Cong Nghe Thong Tin");

        private final String value;

//        @Override
//        public String toString() {
//            switch (this) {
//                case KhoaHocTuNhien:
//                    return "Khoa Hoc Tu Nhien";
//                case CongNgheThongTin:
//                    return "Cong Nghe Thong Tin";
//                case DienTuVienThong:
//                    return "Dien Tu Vien Thong";
//                case VanHocNgheThuat:
//                    return "Van Hoc - Nghe Thuat";
//
//            }
//            return super.toString();
//        }
        
        @Override
        public String toString() {
            return this.value;
        }
        
        //tao constructor va get tu dong, no cung ko cho set value san luon
        private ChuyenNganh(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}

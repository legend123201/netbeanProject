/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excute;

import atm.MayATM;
import atm.TheATM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import khachhang.KhachHang;
import workwithfile.WorkWithFile;

/**
 *
 * @author hocvien
 */
public class QuanLyThe {

    private static Scanner scanner = new Scanner(System.in);
    private WorkWithFile wwf = new WorkWithFile();

    public void main1(ArrayList<TheATM> ds, ArrayList<MayATM> ds2) {
        String luaChon1;
        while (true) {
            Menu1();
            luaChon1 = scanner.nextLine();
            switch (luaChon1) {
                case "1":
                    ThemTK(ds);
                    break;
                case "2":
                    ThemMay(ds2);
                    break;
                case "3":
                    xuatDsThe(ds);
                    break;
                case "4":
                    xuatDsMay(ds2);
                    break;
                case "0":
                    return;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        }
    }

//    public void main2(int mathe) {
//        String luaChon2;
//
//        while (true) {
//            Menu2(mathe);
//            luaChon2 = scanner.nextLine();
//            switch (luaChon2) {
//                case "1":
//                    rut(mathe);
//                    break;
//                case "2":
//
//                    break;
//                case "3":
//                    truyvan(mathe);
//                    break;
//                case "4":
//                    doima(mathe);
//                    break;
//                case "0":
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("invalid! please choose action in below menu:");
//                    break;
//            }
//        }
//    }
    public void Menu1() {
        System.out.println("-----------menu------------");
        System.out.println("1. Them tai khoan.");
        System.out.println("2. Them may ATM.");
        System.out.println("3. Xuat danh sach the.");
        System.out.println("4. Xuat danh sach may.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public void Menu2(int mathe) {
        System.out.println("-----------menu------------");
        System.out.println("1. Rut tien.");
        System.out.println("2. Chuyen tien.");
        System.out.println("3. Truy van so du.");
        System.out.println("4. Doi ma PIN.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public void ThemTK(ArrayList<TheATM> ds) {
        String hoVaTenDem, ten, diaChi;
        int soCMND, soDT, maThe, soDu, maPIN;
        System.out.println("Nhap so CMND: ");
        soCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ho va ten dem: ");
        hoVaTenDem = scanner.nextLine();
        System.out.println("Nhap ten: ");
        ten = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        soDT = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ma the: ");
        maThe = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so du: ");
        soDu = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ma PIN: ");
        maPIN = Integer.parseInt(scanner.nextLine());
        KhachHang kh = new KhachHang(soCMND, hoVaTenDem, ten, diaChi, soDT);
        TheATM the = new TheATM(maThe, maPIN, kh, soDu);
        the.ChonNganHang();
        ds.add(the);
    }

    public void ThemMay(ArrayList<MayATM> ds2) {
        String diaChi;
        int maMay, soDu;
        System.out.println("Nhap ma may: ");
        maMay = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.println("Nhap so du: ");
        soDu = Integer.parseInt(scanner.nextLine());
        MayATM may = new MayATM(maMay, diaChi, soDu);
        may.ChonNganHang();
        ds2.add(may);
    }

//    public void xoataikhoan() {
//        int mathe;
//        System.out.println("Nhap ma the muon xoa: ");
//        mathe = Integer.parseInt(scanner.nextLine());
//        for (TheATM i : ds) {
//            if (i.getMaThe() == mathe) {
//                ds.remove(i);
//                break;
//            }
//        }
//    }
//
    public void xuatDsThe(ArrayList<TheATM> ds) {
        for (TheATM i : ds) {
            System.out.println("|||||||||||||||||||");
            System.out.print("So CMND: ");
            System.out.println(i.getKh().getSoCMND());
            System.out.print("Ho va ten dem: ");
            System.out.println(i.getKh().getHoVaTenDem());
            System.out.print("Ten: ");
            System.out.println(i.getKh().getTen());
            System.out.print("Dia chi: ");
            System.out.println(i.getKh().getDiaChi());
            System.out.print("So dien thoai: ");
            System.out.println(i.getKh().getSoDienThoai());
            System.out.print("Ma the: ");
            System.out.println(i.getMaThe());
            System.out.print("Ten ngan hang: ");
            System.out.println(i.getTenNganHang());
            System.out.print("So du: ");
            System.out.println(i.getSoDu());
        }
    }
    
    public void xuatDsMay(ArrayList<MayATM> ds2) {
        for (MayATM i : ds2) {
            System.out.println("|||||||||||||||||||");
            System.out.print("Ma may: ");
            System.out.println(i.getMaMay());
            System.out.print("Dia chi: ");
            System.out.println(i.getDiaChi());
            System.out.print("Ten ngan hang: ");
            System.out.println(i.getTenNganHang());
            System.out.print("So du: ");
            System.out.println(i.getSoDu());
        }
    }
//
//    public void rut(int mathe) {
//        int soTien;
//        System.out.println("Nhap so tien rut: ");
//        soTien = Integer.parseInt(scanner.nextLine());
//        for (TheATM i : ds) {
//            if (mathe == i.getMaThe()) {
//                if (soTien < i.getSoDu()) {
//                    i.rut(soTien);
//                    break;
//                } else {
//                    System.out.println("Khong du tien!");
//                    break;
//                }
//            }
//        }
//    }
//
//    public void truyvan(int mathe) {
//        for (TheATM i : ds) {
//            if (mathe == i.getMaThe()) {
//                System.out.println("So tien con lai la: ");
//                System.out.println(i.getSoDu());
//                break;
//            }
//        }
//    }
//
//    public void doima(int mathe) {
//        for (TheATM i : ds) {
//            if (mathe == i.getMaThe()) {
//                System.out.println("Nhap ma the moi: ");
//                int x = Integer.parseInt(scanner.nextLine());
//                i.setMaPin(x);
//                System.out.println("Doi thanh cong!");
//                break;
//            }
//        }
//    }
//
//    public void Sort() {
//
//        Collections.sort(ds, new Comparator<TheATM>() {
//            @Override
//            public int compare(TheATM t1, TheATM t2) {
//                return t1.getKh().getTen().compareTo(t2.getKh().getTen());
//            }
//        });
//    }
}

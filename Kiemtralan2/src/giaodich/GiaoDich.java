/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodich;

import Excute.QuanLyThe;
import atm.MayATM;
import atm.TheATM;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hocvien
 */
public class GiaoDich {

    private Scanner scanner = new Scanner(System.in);

    public void main(int mamay, int mathe, ArrayList<TheATM> ds, ArrayList<MayATM> ds2, QuanLyThe ql) {
        String luaChon2;

        while (true) {
            Menu(mathe);
            luaChon2 = scanner.nextLine();
            switch (luaChon2) {
                case "1":
                    rut(mamay, mathe, ds, ds2);
                    break;
                case "2":
                    chuyenkhoan(mamay, mathe, ds, ds2);
                    break;
                case "3":
                    truyvan(mathe, ds);
                    break;
                case "4":
                    //doima(mathe);
                    break;
                case "5":
                    XemLichSu(mathe, ds);
                    break;
                case "0":
                    return;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        }
    }

    public void Menu(int mathe) {
        System.out.println("-----------menu------------");
        System.out.println("1. Rut tien.");
        System.out.println("2. Chuyen tien.");
        System.out.println("3. Truy van so du.");
        System.out.println("4. Doi ma PIN.");
        System.out.println("5. Xem lich su giao dich.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public void rut(int mamay, int mathe, ArrayList<TheATM> ds, ArrayList<MayATM> ds2) {
        int soTien;
        System.out.println("Nhap so tien rut: ");
        soTien = Integer.parseInt(scanner.nextLine());
        MayATM j = null;
        int phi = 3300;
        for (MayATM i : ds2) {
            if (mamay == i.getMaMay()) {
                j = i;
            }
        }
        if (j == null) {
            return;
        }
        for (TheATM i : ds) {
            if (mathe == i.getMaThe()) {
                if (i.getTenNganHang() == j.getTenNganHang()) {
                    phi = 1100;
                }
                if (soTien + phi <= i.getSoDu()) {
                    i.rut(soTien + phi);
                    System.out.println("Rut thanh cong!");
                    //ghi vao lich su giao dich
                    Date date = java.util.Calendar.getInstance().getTime();
                    i.themVaoLichSu("Da rut " + String.valueOf(soTien) + " vao " + date.toString());
                } else {
                    System.out.println("Khong du tien thuc hien giao dich!");
                }
            }
        }
    }

    public void truyvan(int mathe, ArrayList<TheATM> ds) {
        for (TheATM i : ds) {
            if (mathe == i.getMaThe()) {
                System.out.println("Ten khach hang: " + (i.getKh().getHoVaTenDem() + " " + i.getKh().getTen()));
                System.out.println("So tien con lai la: " + i.getSoDu());
                break;
            }
        }
    }

    public void chuyenkhoan(int mamay, int mathe1, ArrayList<TheATM> ds1, ArrayList<MayATM> ds3) {
        int soTien;
        int mathe2;
        MayATM j = null;
        int phi = 3300;
        for (MayATM i : ds3) {
            if (mamay == i.getMaMay()) {
                j = i;
            }
        }
        if (j == null) {
            return;
        }
        for (TheATM i : ds1) {
            if (mathe1 == i.getMaThe()) {
                if (i.getTenNganHang() == j.getTenNganHang()) {
                    phi = 1100;
                    System.out.println("Nhap so tai khoan can chuyen: ");
                    mathe2 = Integer.parseInt(scanner.nextLine());
                    for (TheATM k : ds1) {
                        if (mathe2 == k.getMaThe()) {
                            System.out.println("Nhap so tien can chuyen: ");
                            soTien = Integer.parseInt(scanner.nextLine());
                            if (soTien + phi <= i.getSoDu()) {
                                i.chuyen(soTien + phi);
                                int x = k.getSoDu() + soTien;
                                k.setSoDu(x);
                                System.out.println("Chuyen tien thanh cong!");
                                //ghi vao lich su giao dich
                                Date date = java.util.Calendar.getInstance().getTime();
                                i.themVaoLichSu("Da chuyen " + String.valueOf(soTien) + " cho tai khoan " + String.valueOf(k.getMaThe()) + " vao " + date.toString());
                                k.themVaoLichSu("Da nhan " + String.valueOf(soTien) + " tu tai khoan " + String.valueOf(k.getMaThe()) + " vao " + date.toString());
                                break;
                            } else {
                                System.out.println("So tien con lai khong du!");
                                break;
                            }

                        } else {
                            System.out.println("Khong tim thay so tai khoan nay!");
                            break;
                        }
                    }
                }
                break;
            }
        }
    }
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

    public void XemLichSu(int mathe, ArrayList<TheATM> ds) {
        for (TheATM i : ds) {
            if (i.getMaThe() == mathe) {
                System.out.println("Lich su: ");
                for (String j : i.getLichSu()) {
                    System.out.println(j);
                }
                break;
            }
        }
    }
}

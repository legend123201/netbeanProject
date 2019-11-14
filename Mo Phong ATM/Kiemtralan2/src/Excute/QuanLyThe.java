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
import static kiemtralan2.Kiemtralan2.ds;
import static kiemtralan2.Kiemtralan2.ds2;
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
        do {
            System.out.println("Nhap ma the: ");
            maThe = Integer.parseInt(scanner.nextLine());
            if(kiemTra(maThe)){
                System.out.println("Da ton tai ma the nay! Moi nhap lai!"); 
            }
        } while (kiemTra(maThe));
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
        do {
            System.out.println("Nhap ma may: ");
            maMay = Integer.parseInt(scanner.nextLine());
            if(kiemTra2(maMay)){
                System.out.println("Da ton tai ma may nay! Moi nhap lai!"); 
            }
        } while (kiemTra2(maMay));
        System.out.println("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.println("Nhap so du: ");
        soDu = Integer.parseInt(scanner.nextLine());
        MayATM may = new MayATM(maMay, diaChi, soDu);
        may.ChonNganHang();
        ds2.add(may);
    }


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
            System.out.print("Ma PIN: ");
            System.out.println(i.getMaPin());
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

    public static boolean kiemTra(int x) {
        for (TheATM i : ds) {
            if (x == i.getMaThe()) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean kiemTra2(int x) {
        for (MayATM i : ds2) {
            if (x == i.getMaMay()) {
                return true;
            }
        }
        return false;
    }
}

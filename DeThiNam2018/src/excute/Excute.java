/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excute;

import dethinam2018.Structure.BanDoc;
import dethinam2018.Structure.Sach;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import workwithfile.WorkWithFile;

/**
 *
 * @author legen
 */
public class Excute {

    private Scanner scanner = new Scanner(System.in);
    private WorkWithFile wwf = new WorkWithFile();

    public void main(HashMap<Integer, Sach> dsSach, HashMap<Integer, BanDoc> dsBanDoc) {
        int luaChon;
        while (true) {
            Menu();
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    ThemDauSach(dsSach);
                    break;
                case 2:
                    ThemBanDoc(dsBanDoc);
                    break;
                case 3:
                    XuatDSDauSach(dsSach);
                    break;
                case 4:
                    XuatDSBanDoc(dsBanDoc);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lua chon khong hop le, moi chon lai!");
            }
        }
    }

    public void ThemDauSach(HashMap<Integer, Sach> dsSach) {
        System.out.println("Moi ban nhap thong tin cho dau sach moi!");
        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        Sach s = new Sach(tenSach, tacGia, namXuatBan, soLuong);
        dsSach.put(s.getMaSach(), s);
    }

    public void ThemBanDoc(HashMap<Integer, BanDoc> dsBanDoc) {

    }

    public void XuatDSDauSach(HashMap<Integer, Sach> dsSach) {
        System.out.println("Danh sach dau sach: ");
        dsSach.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v.getTenSach());
            System.out.println(v.getTacGia());
            System.out.println(v.getNamXuatBan());
            System.out.println(v.getChuyenNganh());
            System.out.println(v.getSoLuong());
            System.out.println("-------------");
        });
    }

    public void XuatDSBanDoc(HashMap<Integer, BanDoc> dsBanDoc) {

    }

    public void Menu() {
        System.out.println("----MENU----");
        System.out.println("1. Them dau sach.");
        System.out.println("2. Them ban doc.");
        System.out.println("3. Xuat danh sach dau sach.");
        System.out.println("4. xuat danh sach ban doc.");
        System.out.println("0. Exit");
        System.out.println("------------");
        System.out.print("Moi ban chon chuc nang: ");
    }
}

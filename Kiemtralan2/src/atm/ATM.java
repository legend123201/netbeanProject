/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author hocvien
 */
public abstract class ATM{
    protected enum nganHang {
        Agribank,
        Sacombank,
        ACB,
        BIDV
    }
    protected nganHang loaiNganHang;
    protected int soDu;
    Scanner scanner = new Scanner(System.in);
    
    public void ChonNganHang() {
        String luaChon;
        while (true) {
            Menu1();
            luaChon = scanner.nextLine();
            switch (luaChon) {
                case "1":
                    this.loaiNganHang = nganHang.Agribank;
                    return;
                case "2":
                    this.loaiNganHang = nganHang.Sacombank;
                    return;
                case "3":
                    this.loaiNganHang = nganHang.ACB;
                    return;
                case "4":
                    this.loaiNganHang = nganHang.BIDV;
                    return;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        }
    }

    public nganHang getTenNganHang() {
        return loaiNganHang;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public void Menu1() {
        System.out.println("Chon ten ngan hang: ");
        System.out.println("1. Agribank.");
        System.out.println("2. Sacombank.");
        System.out.println("3. ACB.");
        System.out.println("4. BIDV.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

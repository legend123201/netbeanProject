/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptrongsach370to372;

import java.util.Scanner;
import dictionary.TuDien;

/**
 *
 * @author legen
 */
public class BaiTapTrongSach370to372 {

    static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String luaChon;
        TuDien td = new TuDien();
        while (true) {
            Menu();
            luaChon = scanner.nextLine();
            switch (luaChon) {
                case "1":
                    td.ThemTu();
                    break;
                case "2":
                    td.Xuat();
                    break;
                case "3":
                    td.TraTu();
                    break;
                case "4":
                    td.SortTheoTu();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Them tu.");
        System.out.println("2. Xuat danh sach tu dien.");
        System.out.println("3. Tra tu.");
        System.out.println("4. Sort theo tu.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

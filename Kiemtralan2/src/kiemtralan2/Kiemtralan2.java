/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtralan2;

import Excute.QuanLyThe;
import atm.ATM;
import atm.MayATM;
import atm.TheATM;
import giaodich.GiaoDich;
import java.util.ArrayList;
import java.util.Scanner;
import workwithfile.WorkWithFile;

/**
 *
 * @author hocvien
 */
public class Kiemtralan2 {

    private static final QuanLyThe ql = new QuanLyThe();
    private static final GiaoDich gd = new GiaoDich();
    public static ArrayList<TheATM> ds = new ArrayList<>();
    public static ArrayList<MayATM> ds2 = new ArrayList<>();
    public static ArrayList<ATM> ds3 = new ArrayList<>();
    private static WorkWithFile wwf = new WorkWithFile();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        ds3 = wwf.readATM();
        for (ATM i : ds3) {
            if (i instanceof TheATM) {
                TheATM temp = new TheATM();
                temp = (TheATM) i;
                ds.add(temp);
            } else {
                MayATM temp = new MayATM();
                temp = (MayATM) i;
                ds2.add(temp);
            }
        }
        ds3.clear();
        
        String luaChon;
        while (true) {
            Menu();
            luaChon = x.nextLine();
            switch (luaChon) {
                case "1":
                    ql.main1(ds, ds2);
                    break;
                case "2":
                    int maMay,
                     mathe,
                     maPIN;
                    System.out.println("Nhap ma may: ");
                    maMay = Integer.parseInt(x.nextLine());
                    while (true) {

                        System.out.println("Nhap ma the: ");
                        mathe = Integer.parseInt(x.nextLine());
                        if (kiemTra(mathe)) {
                            System.out.println("Nhap ma PIN: ");
                            maPIN = Integer.parseInt(x.nextLine());
                            if (kiemTra2(maPIN)) {
                                gd.main(maMay, mathe, ds, ds2);
                                break;
                            } else {
                                System.out.println("Sai ma PIN!");
                                break;
                            }
                        } else {
                            System.out.println("Khong ton tai!");
                            break;
                        }
                    }
                    break;
                case "0":
                    ds3.addAll(ds);
                    ds3.addAll(ds2);
                    wwf.writeATM(ds3);
                    return;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
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
        for (TheATM i : ds) {
            if (x == i.getMaPin()) {
                return true;
            }
        }
        return false;
    }

    public static void Menu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Quan ly the.");
        System.out.println("2. Dang nhap khach hang.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

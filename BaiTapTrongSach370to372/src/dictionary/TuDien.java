/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import word.Word;

/**
 *
 * @author legen
 */
public class TuDien {

    private ArrayList<Word> dsCacTu = new ArrayList<Word>();
    private static final Scanner scanner = new Scanner(System.in);

    public void ThemTu() {
        Word w = new Word();
        w.Nhap();
        dsCacTu.add(w);
    }

    public void Xuat() {
        System.out.println("Danh sach cua tu dien: ");
        for (Word w : dsCacTu) {
            w.Xuat();
        }
    }

    public void TraTu() {
        String luaChon;
        System.out.print("Nhap tu ban muon tra: ");
        String temp = scanner.nextLine();
        for (Word w : dsCacTu) {
            if (w.getTu().compareTo(temp) == 0) {
                w.Xuat();
                while (true) {
                    Menu();
                    luaChon = scanner.nextLine();
                    switch (luaChon) {
                        case "1":
                            dsCacTu.remove(w);
                            System.out.print("Da xoa xong!");
                            return;
                        case "2":
                            whileTrueSua(w);
                            return;
                        case "0":
                            return;
                        default:
                            System.out.println("invalid! please choose action in below menu:");
                            break;
                    }
                }
                //return;
            }
        }
        System.out.println("Tu nay khong co trong tu dien!");
    }

    public void SortTheoTu() {
//        Collections.sort(dsCacTu, new Comparator<String>{ 
//        @Override
//            public int compare(Word t1, Word t2) {
//                return t1.getTu().compareTo(t2.getTu())});

        Collections.sort(dsCacTu, new Comparator<Word>() {
            @Override
            public int compare(Word t1, Word t2) {
                return t1.getTu().compareTo(t2.getTu());
            }
        });
    }

    public void Menu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Xoa.");
        System.out.println("2. Sua.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public void whileTrueSua(Word w) {
        String luaChon2;
        while (true) {
            MenuSua();
            luaChon2 = scanner.nextLine();
            switch (luaChon2) {
                case "1":
                    System.out.println("Nhap tu moi: ");
                    w.setTu(scanner.nextLine());
                    return;
                case "2":
                    System.out.println("Nhap nghia moi: ");
                    w.setNghia(scanner.nextLine());
                    return;
                case "0":
                    return;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        }
    }

    public void MenuSua() {
        System.out.println("-----------menu------------");
        System.out.println("1. Sua tu.");
        System.out.println("2. Sua nghia.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

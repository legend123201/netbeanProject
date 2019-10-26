/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSHangHoa;

import WorkWithFile.WorkWithFile;
import hanghoa.HangDienMay;
import hanghoa.HangHoa;
import hanghoa.HangThucPham;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author legen
 */
public class DSHangHoa {

    private ArrayList<HangHoa> dsHangHoa = new ArrayList<>();
    private String luaChon1;
    private String luaChon2;
    private static final Scanner scanner = new Scanner(System.in);
    private WorkWithFile wwf;

    public DSHangHoa() {
        wwf = new WorkWithFile();
        this.dsHangHoa = wwf.read();
    }

    public void ExcuteMenu() {

        while (true) {
            showMenu();
            luaChon1 = scanner.nextLine();
            HangHoa hh;
            switch (luaChon1) {
                case "1":
                    System.out.println("1: hang dien may, 2: hang thuc pham. Hay chon loai mat hang:");
                    luaChon2 = scanner.nextLine();
                    if ("1".equals(luaChon2)) {
                        hh = new HangDienMay();
                    } else if ("2".equals(luaChon2)) {
                        hh = new HangThucPham();
                    } else {
                        System.out.println("Chi duoc chon 1 hoac 2!");
                        break;
                    }
                    hh.Nhap();
                    dsHangHoa.add(hh);
                    break;
                case "2":
                    XuatDS();
                    break;
                case "0":
                    wwf.write(dsHangHoa);
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        }
    }

    public void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Them hang hoa.");
        System.out.println("2. Xuat danh sach hang hoa.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public void XuatDS() {
        HangDienMay temp;
        for (HangHoa i : dsHangHoa) {
            if (i instanceof HangDienMay) {
                i.Xuat();
                temp = (HangDienMay) i;
                System.out.println(temp.getDtt1().getDtt2().getTada3());
                
            }
        }
    }
}

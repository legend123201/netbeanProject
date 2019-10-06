/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachhocsinh;

import hocsinh.*;
import java.util.Scanner;

/**
 *
 * @author legen
 */
public class DSHocSinh {

    private HocSinh ds[];
    private int n;
    private static final Scanner scanner = new Scanner(System.in);

    public void NhapDs() {
        System.out.print("Nhap so luong hoc sinh: ");
        n = Integer.parseInt(scanner.nextLine());
        ds = new HocSinh[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new HocSinh();
            ds[i].Input();
        }
        System.out.println("-------------------------");
    }

    public void XuatDs() {
        System.out.println("-------Danh sach hoc sinh-----");
        for (int i = 0; i < n; i++) {
            ds[i].Show();
        }
    }

    public void SapXep() {
        System.out.println("-------Danh sach hoc sinh sau khi sap xep-----");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].getDiemTrungBinh() < ds[j].getDiemTrungBinh()) {
                    Swap(ds[i], ds[j]);
                }
            }
        }
    }

    public void Swap(HocSinh hs1, HocSinh hs2) {
        HocSinh temp;
        temp = hs1;
        hs1 = hs2;
        hs2 = temp;
    }
}

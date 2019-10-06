/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word;

import java.util.Scanner;

/**
 *
 * @author legen
 */
public class Word {

    private String tu;
    private String nghia;
    private static final Scanner scanner = new Scanner(System.in);

    public Word() {
    }

    public Word(String tu, String nghia) {
        this.tu = tu;
        this.nghia = nghia;
    }

    public void Nhap() {
        System.out.println("Nhap tu muon them: ");
        this.tu = scanner.nextLine();
        System.out.println("Nhap nghia cua tu vua them: ");
        this.nghia = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println(this.tu + "\t\tnghia: " + "\t\t" + this.nghia);
    }

    public String getTu() {
        return tu;
    }

    public void setTu(String tu) {
        this.tu = tu;
    }

    public String getNghia() {
        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }

}

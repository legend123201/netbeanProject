/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.Serializable;
import java.util.ArrayList;
import khachhang.KhachHang;

/**
 *
 * @author hocvien
 */
public class TheATM extends ATM{
    private int maThe;
    private int maPin;
    private KhachHang kh;
    private ArrayList<String> lichSu = new ArrayList<>();

    public TheATM(int maThe, int maPin, KhachHang kh, int soDu) {
        this.maThe = maThe;
        this.maPin = maPin;
        this.kh = kh;
        this.soDu = soDu;
    
    }

    public TheATM() {
    }
    
    public void rut(int soTienRut) {    
        this.soDu = this.soDu - soTienRut;
    }
    
    public void chuyen(int soTienChuyen) {
        this.soDu = this.soDu - soTienChuyen;
    }
    
    public void nap(int soTienNap) {
        this.soDu = this.soDu + soTienNap;
    }
    
    public void themVaoLichSu(String s){
        this.lichSu.add(s);
    }

    public ArrayList<String> getLichSu() {
        return lichSu;
    }
    
    public int getMaThe() {
        return maThe;
    }

    public void setMaThe(int maThe) {
        this.maThe = maThe;
    }

    public int getMaPin() {
        return maPin;
    }

    public void setMaPin(int maPin) {
        this.maPin = maPin;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }
}

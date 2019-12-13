/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethinam2018.Structure;

import java.io.Serializable;

/**
 *
 * @author legen
 */
public class BanDoc implements Serializable{

    private static int maBanDocBatDau;
    private int maBanDoc;
    private String hoTen;
    private String diaChi;
    private long soDT;

    public BanDoc(int maBanDoc, String hoTen, String diaChi, long soDT) {
        this.maBanDoc = maBanDocBatDau++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public BanDoc() {
    }
    
    
    
    public static int getMaBanDocBatDau() {
        return maBanDocBatDau;
    }

    public static void setMaBanDocBatDau(int maBanDocBatDau) {
        BanDoc.maBanDocBatDau = maBanDocBatDau;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public long getSoDT() {
        return soDT;
    }

    public void setSoDT(long soDT) {
        this.soDT = soDT;
    }

}

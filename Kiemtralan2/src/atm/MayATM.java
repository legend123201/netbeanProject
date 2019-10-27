/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.Serializable;

/**
 *
 * @author hocvien
 */
public class MayATM extends ATM{

    private int maMay;
    private String diaChi;

    public MayATM(int maMay, String diaChi, int soDu) {
        this.maMay = maMay;
        this.diaChi = diaChi;
        this.soDu = soDu;
    }

    public MayATM() {
    }

    
    
    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}

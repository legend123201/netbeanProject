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
public class MaSoHienThoi implements Serializable{

    private int maDauSach = 10000;
    private int maBanDoc = 10000;

    public MaSoHienThoi() {
    }

    public int getMaDauSach() {
        return maDauSach;
    }

    public void setMaDauSach(int maDauSach) {
        this.maDauSach = maDauSach;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
    }

}

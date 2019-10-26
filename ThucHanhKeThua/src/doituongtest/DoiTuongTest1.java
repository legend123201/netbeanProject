/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituongtest;

import java.io.Serializable;

/**
 *
 * @author legen
 */
public class DoiTuongTest1 implements Serializable{
    private int tada1 = 5;
    private String tada2 = "lol";
    private DoiTuongTest2 dtt2 = new DoiTuongTest2();

    public DoiTuongTest2 getDtt2() {
        return dtt2;
    }

    public void setDtt2(DoiTuongTest2 dtt2) {
        this.dtt2 = dtt2;
    }

    public int getTada1() {
        return tada1;
    }

    public void setTada1(int tada1) {
        this.tada1 = tada1;
    }

    public String getTada2() {
        return tada2;
    }

    public void setTada2(String tada2) {
        this.tada2 = tada2;
    }

    public DoiTuongTest1() {
    }
}

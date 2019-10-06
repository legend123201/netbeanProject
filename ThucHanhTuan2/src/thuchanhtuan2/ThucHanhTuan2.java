/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanhtuan2;

import hocsinh.*;
import danhsachhocsinh.*;
/**
 *
 * @author legen
 */
public class ThucHanhTuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      HocSinh hs = new HocSinh();
//      hs.Input();
//      hs.Show();
      
     DSHocSinh ds = new DSHocSinh();
     ds.NhapDs();
     ds.XuatDs();
     ds.SapXep();
     ds.XuatDs();
    }
    
}

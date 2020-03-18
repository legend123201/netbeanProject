/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethinam2018;

import dethinam2018.Structure.BanDoc;
import dethinam2018.Structure.MaSoHienThoi;
import dethinam2018.Structure.Sach;
import excute.Excute;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import workwithfile.WorkWithFile;

/**
 *
 * @author legen
 */
public class DeThiNam2018 {

    /**
     * @param args the command line arguments
     */
    static HashMap<Integer, Sach> dsSach = new HashMap<>();
    static HashMap<Integer, BanDoc> dsBanDoc = new HashMap<>();
    static MaSoHienThoi ms = new MaSoHienThoi();
    static WorkWithFile wwf = new WorkWithFile();

    public static void main(String[] args) {
        // TODO code application logic here
        File fileDSDauSach = new File("sach.txt");
        if (!fileDSDauSach.exists()) {
            try {
                fileDSDauSach.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        dsSach = wwf.ReadDSDauSach(fileDSDauSach);

        File fileMaSoHienThoi = new File("maso.txt");
        if (!fileMaSoHienThoi.exists()) {
            try {
                fileMaSoHienThoi.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ms = wwf.ReadMaSoHienThoi(fileMaSoHienThoi);

        Sach s = new Sach();
        s.setMaSachBatDau(ms.getMaDauSach());
        BanDoc bd = new BanDoc();
        bd.setMaBanDocBatDau(ms.getMaBanDoc());
        Excute exc = new Excute();
        exc.main(dsSach, dsBanDoc);
        wwf.WriteDSDauSach(dsSach, fileDSDauSach);
        ms.setMaBanDoc(bd.getMaBanDocBatDau());
        ms.setMaDauSach(s.getMaSachBatDau());
        wwf.WriteMaSoHienThoi(ms, fileMaSoHienThoi);
    }

}

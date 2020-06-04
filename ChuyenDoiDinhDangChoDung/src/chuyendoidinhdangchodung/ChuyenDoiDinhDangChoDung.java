/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuyendoidinhdangchodung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author legen
 */
public class ChuyenDoiDinhDangChoDung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File f1 = new File("input.txt");
        if (!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        File f2 = new File("output.txt");
        if (!f2.exists()) {
            try {
                f2.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            Reader reader = new FileReader(f1);
            Writer writer = new FileWriter(f2);

            br = new BufferedReader(reader);
            bw = new BufferedWriter(writer);

            String s, s_fixed;
//            s = br.readLine();
//            if (s == null) {
//                System.out.println("null");
//            }
//            bw.write(s);
//            bw.newLine();
//
//            s = br.readLine();
//            if (s.length() == 1) {
//                System.out.println("null");
//            }
//            System.out.println(s.length());
//            //bw.write(s);
//            bw.newLine();
//
//            s = br.readLine();
//            if (s == null) {
//                System.out.println("null");
//            }
//            if (s.indexOf(":") != -1) {
//                System.out.println("chinh la no");
//            }
//            s_fixed = s.replaceAll(": ", ":");
//            s = s_fixed;
//            bw.write(s);
//            bw.newLine();
            do {
                s = br.readLine();
                
                if (s == null) {
                    return;
                }
                //neu ma dong la khoang trang thi ko wtrie no ra ma xuong xong luon
                if(s.length() == 1){
                    char a[] = s.toCharArray();
                    int t = a[0] - '0';
                    if(t <10 && t > 0){
                        //ko co dong lenh
                    }else{
                        bw.newLine();
                        continue;
                    }
                }
                //neu co chua ki tu ':' thi sua no 
                if (s.indexOf(":") != -1) {

                    s_fixed = s.replaceAll(": ", ":");
                    s = s_fixed;
                    s_fixed = s.replaceAll("->", "-->");
                    s = s_fixed;
//                    s_fixed = s.replaceAll(".", ",");
//                    s = s_fixed;
                    //no chuyen doi ca so qua day phay wtf???
                    s_fixed = s.replace('.', ',');
                    s = s_fixed;
                }
                bw.write(s);
                bw.newLine();
            } while (s != null);

        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
        }

    }
}

//buffer writer moi lan bat chuong trinh len và write se xoa sach trong file output va ghi lai tu dau
//dong ma co dau cach thi no ko tra ve null hay la ki tu " " hoac ki tu "\t" ????

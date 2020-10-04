/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author legen
 */
public class client_Tong2So_TCP {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 1234);
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        Scanner scanner = new Scanner(System.in);

//        int a = 0, b = 0, tong = 0;
//        boolean check1 = false;
//        boolean check2 = false;
//        while(!check1){
//            try {
//                System.out.println("Nhap so a: ");
//                a = scanner.nextInt();
//                check1 = true;
//            } catch (Exception e) {
//                System.out.println("Nhap ko dung, moi nhap lai so a: ");
//                scanner.nextLine();
//            }
//        }
//        while(!check2){
//            try {
//                System.out.println("Nhap so b: ");
//                b = scanner.nextInt();
//                check2 = true;
//            } catch (Exception e) {
//                System.out.println("Nhap ko dung, moi nhap lai so b: ");
//                scanner.nextLine();
//            }
//        }
//        dos.writeInt(a);
//        dos.writeInt(b);
//        tong = dis.readInt();
//        System.out.println("Tong 2 so la: " + tong);
        

//        int n = 10, ketqua;
//        dos.writeInt(n);
//        for (int i = 0; i <= n; i++) {
//            ketqua = dis.readInt();
//            System.out.println(ketqua);
//        }

        int n = 0;
        boolean check = false;
        while(!check){
            try {
                System.out.println("Moi ban nhao vao so nguyen n: ");
                //n = scanner.nextInt();
                n = Integer.parseInt(scanner.nextLine());
                String s = scanner.nextLine();
                System.out.println(s);
                check = true;
            } catch (Exception e) {
                System.out.println("So nhap vao ko hop le, moi nhap lai!");
                //scanner.nextLine();
            }
        }
        if(n < 0){
            n = -n;
        }
        dos.writeInt(n);
        int tong = dis.readInt();
        System.out.println("Tong can tim la: " + tong);
        //giai doan 4: dong ket noi
        client.close();
    }
}

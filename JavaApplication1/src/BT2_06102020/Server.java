/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2_06102020;

import java.io.*;
import java.net.*;

/**
 *
 * @author legen
 */
public class Server {

    static int duongVoCung = 9999;

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket server = new DatagramSocket(1234);
        System.out.println("Server da san sang!!!");
        byte soA[] = new byte[256];
        byte soB[] = new byte[256];
        byte soC[] = new byte[256];

        //tạo datagrampacket nhận dữ liệu
        DatagramPacket soA1 = new DatagramPacket(soA, soA.length);
        DatagramPacket soB1 = new DatagramPacket(soB, soB.length);
        DatagramPacket soC1 = new DatagramPacket(soC, soC.length);
        server.receive(soA1);
        server.receive(soB1);
        server.receive(soC1);

        String bienA = new String(soA1.getData(), 0, soA1.getLength());
        String bienB = new String(soB1.getData(), 0, soB1.getLength());
        String bienC = new String(soC1.getData(), 0, soC1.getLength());

        int a = 0, b = 0, c = 0, tong;
        a = Integer.parseInt(bienA);
        b = Integer.parseInt(bienB);
        c = Integer.parseInt(bienC);
        int nghiem[] = giaiPTBac2(a, b, c);
        
        //byte tong2so[] = new byte[256];
        byte nghiemX1[] = new byte[256];
        byte nghiemX2[] = new byte[256];
        //tong2so = String.valueOf(tong).getBytes();
        nghiemX1 = String.valueOf(nghiem[0]).getBytes();
        nghiemX2 = String.valueOf(nghiem[1]).getBytes();
        
        //DatagramPacket guitong = new DatagramPacket(tong2so, tong2so.length, soA1.getAddress(), soA1.getPort());
        DatagramPacket guiNghiemX1 = new DatagramPacket(nghiemX1, nghiemX1.length, soA1.getAddress(), soA1.getPort());
        DatagramPacket guiNghiemX2 = new DatagramPacket(nghiemX2, nghiemX2.length, soA1.getAddress(), soA1.getPort());
        server.send(guiNghiemX1);
        server.send(guiNghiemX2);
        server.close();
    }

    public static int[] giaiPTBac2(float a, float b, float c) {
        int nghiem[] = {duongVoCung, duongVoCung};
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                //System.out.println("Phương trình vô nghiệm!");
                return nghiem;
            } else {
                //System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
                nghiem[0] = (int) (-c / b);
                return nghiem;
            }

        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
//            System.out.println("Phương trình có 2 nghiệm là: "
//                    + "x1 = " + x1 + " và x2 = " + x2);
            nghiem[0] = (int) x1;
            nghiem[1] = (int) x2;
            return nghiem;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
//            System.out.println("Phương trình có nghiệm kép: "
//                    + "x1 = x2 = " + x1);
            nghiem[0] = nghiem[1] = (int) x1;
            return nghiem;
        } else {
//            System.out.println("Phương trình vô nghiệm!");
            return nghiem;
        }
    }
}

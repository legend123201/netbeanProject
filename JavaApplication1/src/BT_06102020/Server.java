/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT_06102020;

import java.io.*;
import java.net.*;

/**
 *
 * @author legen
 */
public class Server {

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket server = new DatagramSocket(1234);
        System.out.println("Server da san sang!!!");
        byte soA[] = new byte[256];
        byte soB[] = new byte[256];
        //tạo datagrampacket nhận dữ liệu
        DatagramPacket soA1 = new DatagramPacket(soA, soA.length);
        DatagramPacket soB1 = new DatagramPacket(soB, soB.length);
        server.receive(soA1);
        server.receive(soB1);
        
        String bienA = new String(soA1.getData(), 0, soA1.getLength());
        String bienB = new String(soB1.getData(), 0, soB1.getLength());
        
        int a = 0, b = 0, tong = 0;
        a = Integer.parseInt(bienA);
        b = Integer.parseInt(bienB);
        tong = a + b;
        byte tong2so[] = new byte[256];
        tong2so = String.valueOf(tong).getBytes();
        DatagramPacket guitong = new DatagramPacket(tong2so, tong2so.length, soA1.getAddress(), soA1.getPort());
        server.send(guitong);
        server.close();
    }
}

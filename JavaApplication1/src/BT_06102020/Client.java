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
public class Client {
    public static void main(String[] args) throws SocketException {
        DatagramSocket client = new DatagramSocket();
        System.out.println("Da ket noi voi Server");
        DataInputStream input = new DataInputStream(System.in);
        int a,b,tong;
        try {
            System.out.println("Nhap so A: ");
            a = Integer.parseInt(input.readLine());
            System.out.println("Nhap so B: ");
            b = Integer.parseInt(input.readLine());
            
            byte soa[] = new byte[256];
            byte sob[] = new byte[256];
            soa = String.valueOf(a).getBytes(); //chuyen a qua String roi chuyen qua byte
            sob = String.valueOf(b).getBytes();
            
            InetAddress diachi = InetAddress.getByName("localhost");
            int port = 1234;
            DatagramPacket guisoa = new DatagramPacket(soa, soa.length, diachi, port);
            DatagramPacket guisob = new DatagramPacket(sob, sob.length, diachi, port);
            client.send(guisoa);
            client.send(guisob);
            byte tongnhan[] = new byte[256];
            DatagramPacket tongnhanser = new DatagramPacket(tongnhan, tongnhan.length, diachi, port);
            client.receive(tongnhanser);
            String tongdanhan = new String(tongnhanser.getData(), 0, tongnhanser.getLength());
            System.out.println("Tong 2 so la: " + tongdanhan);
            client.close();
        } catch (Exception e) {
        }
    }
}

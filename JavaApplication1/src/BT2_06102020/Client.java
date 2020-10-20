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
public class Client {
    public static void main(String[] args) throws SocketException {
        DatagramSocket client = new DatagramSocket();
        System.out.println("Da ket noi voi Server");
        DataInputStream input = new DataInputStream(System.in);
        int a,b,c,tong;
        try {
            System.out.println("Nhap so A: ");
            a = Integer.parseInt(input.readLine());
            System.out.println("Nhap so B: ");
            b = Integer.parseInt(input.readLine());
            System.out.println("Nhap so C: ");
            c = Integer.parseInt(input.readLine());
            
            byte soa[] = new byte[256];
            byte sob[] = new byte[256];
            byte soc[] = new byte[256];
            soa = String.valueOf(a).getBytes(); //chuyen a qua String roi chuyen qua byte
            sob = String.valueOf(b).getBytes();
            soc = String.valueOf(c).getBytes();
            
            InetAddress diachi = InetAddress.getByName("localhost");
            int port = 1234;
            DatagramPacket guisoa = new DatagramPacket(soa, soa.length, diachi, port);
            DatagramPacket guisob = new DatagramPacket(sob, sob.length, diachi, port);
            DatagramPacket guisoc = new DatagramPacket(soc, soc.length, diachi, port);
            client.send(guisoa);
            client.send(guisob);
            client.send(guisoc);
//            byte tongnhan[] = new byte[256];
//            DatagramPacket tongnhanser = new DatagramPacket(tongnhan, tongnhan.length, diachi, port);
            byte X1nhan[] = new byte[256];
            DatagramPacket X1nhanser = new DatagramPacket(X1nhan, X1nhan.length, diachi, port);
            byte X2nhan[] = new byte[256];
            DatagramPacket X2nhanser = new DatagramPacket(X2nhan, X2nhan.length, diachi, port);
            
            //client.receive(tongnhanser);
            client.receive(X1nhanser);
            client.receive(X2nhanser);
            String X1danhan = new String(X1nhanser.getData(), 0, X1nhanser.getLength());
            String X2danhan = new String(X2nhanser.getData(), 0, X2nhanser.getLength());
            System.out.println("2 nghiem la: " + X1danhan + " " + X2danhan);
            client.close();
        } catch (Exception e) {
        }
    }
}

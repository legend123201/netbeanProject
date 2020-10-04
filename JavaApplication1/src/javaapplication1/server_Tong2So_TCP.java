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
public class server_Tong2So_TCP {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server da san sang!!!");
        Socket client = server.accept();
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        
//        int a = 0, b = 0, tong = 0;
//        a = dis.readInt();
//        b = dis.readInt();
//        tong = a + b;
//        dos.writeInt(tong);
        

//        int n = dis.readInt();
//        int f0 = 0, f1 = 1, fn = 0;
//        dos.writeInt(f0);
//        dos.writeInt(f1);
//        for(int i = 1; i < n; i++){
//            fn = f1 + f0;
//            f0 = f1;
//            f1 = fn;
//            dos.writeInt(fn);
//        }
        

        int tong = 0;
        int n = dis.readInt();
        while(n != 0){
            tong += n%10;
            n /= 10;
        }
        dos.writeInt(tong);
        server.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author legen
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<Float> ds = new ArrayList<>();
//        ArrayList<Float> daXuatRa = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập vào số phần tử của ArrayList: ");
//        int n = Integer.parseInt(scanner.nextLine());
//
//        Float x;
//        for (int i = 0; i < n; i++) {
//            x = Float.parseFloat(scanner.nextLine());
//            ds.add(x);
//        }
//        System.out.println( "Ket qua: ");
//        for(int i = 0; i < n; i++){
//            int dem = 0;
//            for(int j = 0; j < n; j++){
//                if(Objects.equals(ds.get(j), ds.get(i))){
//                    dem++;
//                }
//            }
//            if(dem == 1 && !daXuatRa.contains(ds.get(i))){
//                System.out.print(ds.get(i) + "  ");
//                System.out.println(dem);
//                daXuatRa.add(ds.get(i));
//            }
//        }
        while (true) {
            int a = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("a la so nguyen");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                if (a == 1) {
                    break;
                }
                continue;

            }
        }
        System.out.println(test(3,3));
    }

    public static int test(int a, int b) {
        return a+b;
    }

}

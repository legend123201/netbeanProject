/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import test.cautruc.classa;

/**
 *
 * @author legen
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList<classa> ds = new ArrayList<>();
        classa t1 = new classa(3, 6);
        classa t2 = new classa(4, 8);
        classa t3 = new classa(5, 10);
        ds.add(t1);
        ds.add(t2);
        ds.add(t3);
        HashMap<Integer, classa> ds2 = new HashMap<>();
        ds2.put(t3.getId(), t3);
        System.out.println("Nhap id: ");
        int a1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong muon lay: ");
        int a2 = Integer.parseInt(scanner.nextLine());
        for (classa t : ds) {
            if (a1 == t.getId()) {
                if (ds2.containsKey(a1)) {
                    
                    ds2.get(a1).setSoluong(ds2.get(a1).getSoluong()+a2);
                } else {
                    ds2.put(a1, t);
                    ds2.get(a1).setSoluong(a2);
                }
            }
        }
        System.out.println("-------");
        ds.forEach(t -> {
            System.out.println(t.getId());
            System.out.println(t.getSoluong());
        });
        System.out.println("--------");
        ds2.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v.getSoluong());
        });
    }

}

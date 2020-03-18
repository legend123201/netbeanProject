/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithfile;

import atm.ATM;
import atm.TheATM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author legen
 */
public class WorkWithFile {
    public void writeATM(ArrayList<ATM> ATMList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("atm.txt"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ATMList);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<ATM> readATM() {
        ArrayList<ATM> ATMList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File("atm.txt"));
            ois = new ObjectInputStream(fis);
            ATMList = (ArrayList<ATM>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e)  {
            System.out.println(e.getMessage());
        }
        return ATMList;
    }
}

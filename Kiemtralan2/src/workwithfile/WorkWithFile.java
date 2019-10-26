/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithfile;

import atm.MayATM;
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
    public void writeMayATM(ArrayList<MayATM> MayATMList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("mayatm.txt"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(MayATMList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<MayATM> readMayATM() {
        ArrayList<MayATM> MayATMList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File("mayatm.txt"));
            ois = new ObjectInputStream(fis);
            MayATMList = (ArrayList<MayATM>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e)  {
            e.printStackTrace();
        }
        return MayATMList;
    }
    
    public void writeTheATM(ArrayList<TheATM> TheATMList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("theatm.txt"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(TheATMList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<TheATM> readTheATM() {
        ArrayList<TheATM> TheATMList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File("theatm.txt"));
            ois = new ObjectInputStream(fis);
            TheATMList = (ArrayList<TheATM>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e)  {
            e.printStackTrace();
        }
        return TheATMList;
    }
}

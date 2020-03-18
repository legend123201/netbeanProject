/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithfile;

import dethinam2018.Structure.MaSoHienThoi;
import dethinam2018.Structure.Sach;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;


/**
 *
 * @author legen
 */
public class WorkWithFile {

    public void WriteDSDauSach(HashMap<Integer, Sach> l, File file) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(l);
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //closestream la ham tu tao
            closeStream(fos);
            closeStream(oos);
        }
    }

    public HashMap<Integer, Sach> ReadDSDauSach(File file) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        HashMap<Integer, Sach> t = new HashMap<>();
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            t = (HashMap<Integer, Sach>) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return t;
    }

    public void WriteMaSoHienThoi(MaSoHienThoi l, File file) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(l);
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //closestream la ham tu tao
            closeStream(fos);
            closeStream(oos);
        }
    }

    public MaSoHienThoi ReadMaSoHienThoi(File file) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        MaSoHienThoi t = new MaSoHienThoi();
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            t = (MaSoHienThoi) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return t;
    }
    
    /**
     * close input stream
     *
     * @param is: input stream
     */
    private void closeStream(InputStream is) {
        //deo hieu sao cho nay co the null luon, o tren cap phat new vung nho cho no ro rang, va phai dung if o day moi chay duoc
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * close output stream
     *
     * @param os: output stream
     */
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

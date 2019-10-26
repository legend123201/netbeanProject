package WorkWithFile;

import hanghoa.HangHoa;
import java.io.*;
import java.util.*;

public class WorkWithFile {

    public void write(ArrayList<HangHoa> ds) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("hanghoa.txt"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ds);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<HangHoa> read() {
        ArrayList<HangHoa> ds = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File("hanghoa.txt"));
            ois = new ObjectInputStream(fis);
            ds = (ArrayList<HangHoa>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e)  {
            System.out.println(e.getMessage());
        }
        return ds;
    }
}
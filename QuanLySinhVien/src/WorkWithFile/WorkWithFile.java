package WorkWithFile;

import java.io.*;
import java.util.*;
import Employee.*;

public class WorkWithFile {

    public void write(ArrayList<Employee> employeeList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File("nhanvien.txt"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(employeeList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> read() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File("nhanvien.txt"));
            ois = new ObjectInputStream(fis);
            employeeList = (ArrayList<Employee>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e)  {
            e.printStackTrace();
        }
        return employeeList;
    }
}

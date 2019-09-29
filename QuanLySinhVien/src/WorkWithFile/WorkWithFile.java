package WorkWithFile;

import java.io.*;
import java.util.*;
import Employee.*;

public class WorkWithFile {

    public void write(List<Employee> employeeList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("nhanvien.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(employeeList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> read() {
        List<Employee> employeeList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("nhanvien.txt");
            ois = new ObjectInputStream(fis);
            employeeList = (List<Employee>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e)  {
            e.printStackTrace();
        }
        return employeeList;
    }
}

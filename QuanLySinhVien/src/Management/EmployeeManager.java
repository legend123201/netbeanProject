package Management;

import java.util.*;
import Employee.*;
import WorkWithFile.*;

public class EmployeeManager {

    public static Scanner scanner = new Scanner(System.in);
    private ArrayList<Employee> employeeList;
    private WorkWithFile wwf;

    public EmployeeManager() {

        wwf = new WorkWithFile();
        employeeList = wwf.read();
    }

    public void Them() {
        System.out.print("Nhap ma nhan vien: ");
        String tempMaNhanVien = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String tempTen = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int tempTuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap gioi tinh: ");
        String tempGioiTinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String tempDiaChi = scanner.nextLine();
        Employee temp;
        temp = new Employee(tempMaNhanVien, tempTen, tempTuoi, tempGioiTinh, tempDiaChi);
        employeeList.add(temp);
        wwf.write(employeeList);
    }

    public void Show() {
        try {
            for (Employee i : employeeList) {
                System.out.println("Ma nhan vien: " + i.getMaNhanVien());
                System.out.println("Ten: " + i.getMaNhanVien());
                System.out.println("Tuoi: " + i.getMaNhanVien());
                System.out.println("Gioi tinh: " + i.getMaNhanVien());
                System.out.println("Dia chi: " + i.getMaNhanVien());
                System.out.println("---------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

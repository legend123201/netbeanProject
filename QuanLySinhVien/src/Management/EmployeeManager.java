package Management;

import java.util.*;
import Employee.*;
import WorkWithFile.WorkWithFile;

public class EmployeeManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Employee> employeeList;
    private WorkWithFile wwf;
    
    public void Them(){
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
        Employee temp = new Employee(tempMaNhanVien, tempTen, tempTuoi, tempGioiTinh, tempDiaChi);
        wwf.write(employeeList);
        employeeList.add(temp);
    }
}

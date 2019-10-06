package Main;

import Employee.*;
import Management.*;
import WorkWithFile.*;
import java.util.Scanner;

public class MainProject {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String luaChon;
        EmployeeManager manage = new EmployeeManager();
        while (true) {
            Menu();
            luaChon = scanner.nextLine();
            switch (luaChon) {
                case "1":
                    manage.Them();
                    break;
                case "2":
                   manage.Show();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add employee.");
        System.out.println("2. Show employee.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

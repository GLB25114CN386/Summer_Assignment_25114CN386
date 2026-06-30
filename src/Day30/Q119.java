package Day30;
import java.util.*;
public class Q119 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String empName[] = new String[50];
        String empDept[] = new String[50];
        int empSalary[] = new int[50];
        int n = 0;
        boolean b = true;

        while (b) {
            System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    empName[n] = sc.nextLine();

                    System.out.print("Enter Department: ");
                    empDept[n] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    empSalary[n] = sc.nextInt();

                    n++;
                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < n; i++) {
                            System.out.println((i + 1) + ". Name: " + empName[i]
                                    + ", Department: " + empDept[i]
                                    + ", Salary: " + empSalary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee Name to Search: ");
                    String s = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (empName[i].equalsIgnoreCase(s)) {
                            System.out.println("Employee Found");
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Department: " + empDept[i]);
                            System.out.println("Salary: " + empSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee Name: ");
                    String u = sc.nextLine();
                    found = false;

                    for (int i = 0; i < n; i++) {
                        if (empName[i].equalsIgnoreCase(u)) {
                            System.out.print("Enter New Salary: ");
                            empSalary[i] = sc.nextInt();
                            System.out.println("Salary Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 5:
                    b = false;
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}
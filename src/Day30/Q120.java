package Day30;
import java.util.*;
public class Q110 {
    static Scanner sc = new Scanner(System.in);
    static String name[] = new String[50];
    static int marks[] = new int[50];
    static int n = 0;
    public static void addStudent() {
        System.out.print("Enter Student Name: ");
        name[n] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[n] = sc.nextInt();
        sc.nextLine();

        n++;
        System.out.println("Student Added Successfully.");
    }

    public static void displayStudents() {
        if (n == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + name[i] + " - " + marks[i]);
        }
    }

    public static void searchStudent() {
        System.out.print("Enter Student Name: ");
        String s = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (name[i].equalsIgnoreCase(s)) {
                System.out.println("Student Found");
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void updateMarks() {
        System.out.print("Enter Student Name: ");
        String s = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (name[i].equalsIgnoreCase(s)) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                sc.nextLine();
                System.out.println("Marks Updated Successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter Student Name: ");
        String s = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (name[i].equalsIgnoreCase(s)) {
                for (int j = i; j < n - 1; j++) {
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }
                n--;
                found = true;
                System.out.println("Student Deleted Successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void main(String args[]) {
        boolean b = true;

        while (b) {
            System.out.println("\n===== MINI STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    b = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}
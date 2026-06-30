package Day30;
import java.util.*;
public class Q117 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[50];
        int marks[] = new int[50];
        int n = 0;
        boolean b = true;

        while (b) {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    name[n] = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks[n] = sc.nextInt();
                    n++;
                    System.out.println("Student Record Added Successfully.");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("No Records Found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < n; i++) {
                            System.out.println((i + 1) + ". " + name[i] + " - " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name to Search: ");
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
                    break;

                case 4:
                    System.out.print("Enter Student Name: ");
                    String u = sc.nextLine();
                    found = false;

                    for (int i = 0; i < n; i++) {
                        if (name[i].equalsIgnoreCase(u)) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Marks Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 5:
                    b = false;
                    System.out.println("Exiting Student Record System...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}
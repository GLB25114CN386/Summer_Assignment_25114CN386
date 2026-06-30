package Day30;
import java.util.*;
public class Q118 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String books[] = new String[50];
        boolean issued[] = new boolean[50];
        int n = 0;
        boolean b = true;

        while (b) {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    books[n] = sc.nextLine();
                    issued[n] = false;
                    n++;
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\nLibrary Books:");
                        for (int i = 0; i < n; i++) {
                            System.out.print((i + 1) + ". " + books[i]);
                            if (issued[i]) {
                                System.out.println(" - Issued");
                            } else {
                                System.out.println(" - Available");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String s = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (books[i].equalsIgnoreCase(s)) {
                            System.out.println("Book Found.");
                            if (issued[i]) {
                                System.out.println("Status: Issued");
                            } else {
                                System.out.println("Status: Available");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Name to Issue: ");
                    String issue = sc.nextLine();
                    found = false;

                    for (int i = 0; i < n; i++) {
                        if (books[i].equalsIgnoreCase(issue)) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book is Already Issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book Name to Return: ");
                    String ret = sc.nextLine();
                    found = false;

                    for (int i = 0; i < n; i++) {
                        if (books[i].equalsIgnoreCase(ret)) {
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully.");
                            } else {
                                System.out.println("Book is Already Available.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 6:
                    b = false;
                    System.out.println("Exiting Mini Library System...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}
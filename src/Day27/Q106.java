package Day27;
import java.util.*;
public class Q106
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> employees=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Count Employees");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    String name=sc.nextLine();
                    employees.add(name);
                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    if(employees.size()==0)
                    {
                        System.out.println("No Employees Found.");
                    }
                    else
                    {
                        System.out.println("Employee List:");
                        for(int i=0;i<employees.size();i++)
                        {
                            System.out.println((i+1)+". "+employees.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee Name to Search: ");
                    String search=sc.nextLine();

                    if(employees.contains(search))
                    {
                        System.out.println("Employee Found.");
                    }
                    else
                    {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee Number to Update: ");
                    int index=sc.nextInt();
                    sc.nextLine();

                    if(index>=1 && index<=employees.size())
                    {
                        System.out.print("Enter New Employee Name: ");
                        String newName=sc.nextLine();
                        employees.set(index-1,newName);
                        System.out.println("Employee Updated Successfully.");
                    }
                    else
                    {
                        System.out.println("Invalid Employee Number.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee Name to Delete: ");
                    String del=sc.nextLine();

                    if(employees.remove(del))
                    {
                        System.out.println("Employee Deleted Successfully.");
                    }
                    else
                    {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 6:
                    System.out.println("Total Employees = "+employees.size());
                    break;

                case 7:
                    b=false;
                    System.out.println("Thank You for using Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
        sc.close();
    }
}
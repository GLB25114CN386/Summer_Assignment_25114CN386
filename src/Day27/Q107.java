package Day27;
import java.util.*;
public class Q107
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> salary=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Salary");
            System.out.println("2. Display Salaries");
            System.out.println("3. Search Salary");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Salary");
            System.out.println("6. Calculate Total Salary");
            System.out.println("7. Calculate Average Salary");
            System.out.println("8. Count Salary Records");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Salary: ");
                    double s=sc.nextDouble();
                    salary.add(s);
                    System.out.println("Salary Added Successfully.");
                    break;
                case 2:
                    if(salary.size()==0)
                    {
                        System.out.println("No Salary Records Found.");
                    }
                    else
                    {
                        System.out.println("Salary Records:");
                        for(int i=0;i<salary.size();i++)
                        {
                            System.out.println((i+1)+". "+salary.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Salary to Search: ");
                    double search=sc.nextDouble();

                    if(salary.contains(search))
                    {
                        System.out.println("Salary Record Found.");
                    }
                    else
                    {
                        System.out.println("Salary Record Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Salary Record Number to Update: ");
                    int index=sc.nextInt();
                    if(index>=1 && index<=salary.size())
                    {
                        System.out.print("Enter New Salary: ");
                        double newsalary=sc.nextDouble();
                        salary.set(index-1,newsalary);
                        System.out.println("Salary Updated Successfully.");
                    }
                    else
                    {
                        System.out.println("Invalid Record Number.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Salary to Delete: ");
                    double del=sc.nextDouble();
                    if(salary.remove(Double.valueOf(del)))
                    {
                        System.out.println("Salary Deleted Successfully.");
                    }
                    else
                    {
                        System.out.println("Salary Record Not Found.");
                    }
                    break;
                case 6:
                    double total=0;
                    for(int i=0;i<salary.size();i++)
                    {
                        total=total+salary.get(i);
                    }
                    System.out.println("Total Salary = "+total);
                    break;
                case 7:
                    if(salary.size()==0)
                    {
                        System.out.println("No Salary Records.");
                    }
                    else
                    {
                        double sum=0;
                        for(int i=0;i<salary.size();i++)
                        {
                            sum=sum+salary.get(i);
                        }

                        System.out.println("Average Salary = "+(sum/salary.size()));
                    }
                    break;
                case 8:
                    System.out.println("Total Salary Records = "+salary.size());
                    break;
                case 9:
                    b=false;
                    System.out.println("Thank You for using Salary Management System.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
        sc.close();
    }
}
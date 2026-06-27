package Day27;
import java.util.*;
public class Q105
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Count Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter student name: ");
                    String name=sc.nextLine();
                    names.add(name);
                    System.out.println("Student Added Successfully.");
                    break;
                case 2:
                    if(names.size()==0)
                    {
                        System.out.println("No Students Found.");
                    }
                    else
                    {
                        System.out.println("Student List:");
                        for(int i=0;i<names.size();i++)
                        {
                            System.out.println((i+1)+". "+names.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String search=sc.nextLine();

                    if(names.contains(search))
                    {
                        System.out.println("Student Found.");
                    }
                    else
                    {
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to delete: ");
                    String del=sc.nextLine();

                    if(names.remove(del))
                    {
                        System.out.println("Student Deleted.");
                    }
                    else
                    {
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 5:
                    System.out.println("Total Students = "+names.size());
                    break;
                case 6:
                    b=false;
                    System.out.println("Thank You.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
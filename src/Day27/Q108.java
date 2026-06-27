package Day27;
import java.util.*;
public class Q108
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> marks=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== MARKSHEET GENERATION SYSTEM =====");
            System.out.println("1. Add Percentage");
            System.out.println("2. Display Percentages");
            System.out.println("3. Search Percentage");
            System.out.println("4. Update Percentage");
            System.out.println("5. Delete Percentage");
            System.out.println("6. Display Grades");
            System.out.println("7. Display Highest Percentage");
            System.out.println("8. Display Average Percentage");
            System.out.println("9. Count Students");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Percentage: ");
                    double p=sc.nextDouble();
                    marks.add(p);
                    System.out.println("Percentage Added Successfully.");
                    break;
                case 2:
                    if(marks.size()==0)
                        System.out.println("No Records Found.");
                    else
                    {
                        System.out.println("Student Percentages:");
                        for(int i=0;i<marks.size();i++)
                            System.out.println((i+1)+". "+marks.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter Percentage to Search: ");
                    double search=sc.nextDouble();
                    if(marks.contains(search))
                        System.out.println("Record Found.");
                    else
                        System.out.println("Record Not Found.");
                    break;
                case 4:
                    System.out.print("Enter Student Number to Update: ");
                    int index=sc.nextInt();
                    if(index>=1&&index<=marks.size())
                    {
                        System.out.print("Enter New Percentage: ");
                        double np=sc.nextDouble();
                        marks.set(index-1,np);
                        System.out.println("Percentage Updated Successfully.");
                    }
                    else
                        System.out.println("Invalid Student Number.");
                    break;
                case 5:
                    System.out.print("Enter Percentage to Delete: ");
                    double del=sc.nextDouble();
                    if(marks.remove(Double.valueOf(del)))
                        System.out.println("Record Deleted Successfully.");
                    else
                        System.out.println("Record Not Found.");
                    break;
                case 6:
                    if(marks.size()==0)
                        System.out.println("No Records Found.");
                    else
                    {
                        for(int i=0;i<marks.size();i++)
                        {
                            double m=marks.get(i);
                            if(m>=90)
                                System.out.println((i+1)+". "+m+"% Grade A+");
                            else if(m>=80)
                                System.out.println((i+1)+". "+m+"% Grade A");
                            else if(m>=70)
                                System.out.println((i+1)+". "+m+"% Grade B");
                            else if(m>=60)
                                System.out.println((i+1)+". "+m+"% Grade C");
                            else if(m>=50)
                                System.out.println((i+1)+". "+m+"% Grade D");
                            else
                                System.out.println((i+1)+". "+m+"% Grade F");
                        }
                    }
                    break;
                case 7:
                    if(marks.size()==0)
                        System.out.println("No Records Found.");
                    else
                    {
                        double max=marks.get(0);
                        for(int i=1;i<marks.size();i++)
                            if(marks.get(i)>max)
                                max=marks.get(i);
                        System.out.println("Highest Percentage = "+max);
                    }
                    break;
                case 8:
                    if(marks.size()==0)
                        System.out.println("No Records Found.");
                    else
                    {
                        double sum=0;
                        for(int i=0;i<marks.size();i++)
                            sum+=marks.get(i);
                        System.out.println("Average Percentage = "+(sum/marks.size()));
                    }
                    break;
                case 9:
                    System.out.println("Total Students = "+marks.size());
                    break;
                case 10:
                    b=false;
                    System.out.println("Thank You for using Marksheet Generation System.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
        sc.close();
    }
}
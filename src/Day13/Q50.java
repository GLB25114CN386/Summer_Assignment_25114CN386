package Day13;
import java.util.*;
public class Q50 {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        double avg=0.0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/n;
        System.out.println("The sum of elements is "+sum);
        System.out.println("The average of elements is "+avg);
    }
}

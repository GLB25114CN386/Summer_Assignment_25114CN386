package Day15;
import java.util.*;
public class Q58 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp=a[0];
        for(int i=0;i<n-1;i++)
        {
           a[i]=a[i+1];
        }
        a[n-1]=temp;
        System.out.println("The left rotated array:");
        for(int j=0;j<n;j++)
        {
            System.out.println(a[j]);
        }
    }
}
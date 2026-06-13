package Day15;
import java.util.*;
public class Q59 {
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
        int temp=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
           a[i+1]=a[i];
        }
        a[0]=temp;
        System.out.println("The right rotated array:");
        for(int j=0;j<n;j++)
        {
            System.out.println(a[j]);
        }
    }
}
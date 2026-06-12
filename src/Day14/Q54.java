package Day14;
import java.util.*;
public class Q54 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to count its frequency");
        int num=sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(a[j]==num)
            count++;
        }
            System.out.println("Frequency of the Entered Element in the array is "+count);
    }
}
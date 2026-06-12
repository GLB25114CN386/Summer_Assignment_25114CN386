package Day14;
import java.util.*;
public class Q55 {
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
        int max1=0,max2=0;
        for(int j=0;j<n;j++)
        {
            if(max1<a[j])
            max2=max1;
            max1=a[j];
        }
            System.out.println("The second largest element in the array is "+max2);
    }
}
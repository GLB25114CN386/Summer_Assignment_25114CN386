package Day25;
import java.util.*;
public class Q97 {
    public static void sort(int a[])
    {
        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        System.out.println("Enter the size of second array:");
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        System.out.println("Enter first array elements:");
        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter second array elements:");
        for(int i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        sort(a1);
        sort(a2);
        int k=n1+n2;
        int c[]=new int[k];
        for(int i=0;i<n1;i++)
        {
            c[i]=a1[i];
        }
        for(int i=0;i<n2;i++)
        {
            c[i+n1]=a2[i];
        }
        System.out.println("The Merged Array:");
        for(int i=0;i<k;i++)
        {
            System.out.println(c[i]);
        }
    }
}
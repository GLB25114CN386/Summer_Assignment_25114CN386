package Day16;
import java.util.*;
public class Q61{
    static void sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[minindex])
                    minindex=j;
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp;
        }
    }

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

        sort(a);

        int miss=-1;
        for(int i=0;i<n-1;i++)
        {
            if(a[i+1]-a[i]>1)
            {
                miss=a[i]+1;
                break;
            }
        }

        int miss1[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            miss1[i]=a[i];
        }
        miss1[n]=miss;

        sort(miss1);

        System.out.println("The complete array");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(miss1[i]+" ");
        }
    }
}
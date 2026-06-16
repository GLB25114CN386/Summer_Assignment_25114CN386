package Day17;
import java.util.*;
public class Q66 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter first array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter size of array ");
        int m=sc.nextInt();
        int a[]=new int[m];
        System.out.println("Enter second array elements:");
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        int narr[]=new int[n+m];
        int size=0;
        for(int i=0;i<n;i++)
        {
            narr[size]=arr[i];
            size++;
        }
        for(int i=0;i<m;i++)
        {
            int flag=0;
            for(int j=0;j<size;j++)
            {
                if(a[i]==narr[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                narr[size]=a[i];
                size++;
            }
        }
        System.out.println("The Union of both the arrays");
        for(int i=0;i<size;i++)
        {
            System.out.println(narr[i]);
        }
    }
}
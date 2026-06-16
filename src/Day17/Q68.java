package Day17;
import java.util.*;
public class Q68 {
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
            for(int j=0;j<m;j++)
            {
                if(arr[i]==a[j])
                { 
                    narr[size]=arr[i];
                    size++;
                }
            }
        }
        System.out.println("The common elements");
        for(int i=0;i<size;i++)
        {
            System.out.println(narr[i]);
        }
    }
}
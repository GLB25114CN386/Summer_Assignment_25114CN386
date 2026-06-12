package Day13;
import java.util.*;
public class Q52 {
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
        int ecount=0,ocount=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                ecount++;
            if(a[i]%2!=0)
                ocount++;
        }
        System.out.println("The number of even elements are "+ecount);
        System.out.println("The number of odd elements are "+ocount);
    }
}

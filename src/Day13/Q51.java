package Day13;
import java.util.*;
public class Q51 {
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
        int min=a[0],max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("The minimum element is "+min);
        System.out.println("The maximum element is "+max);
    }
}

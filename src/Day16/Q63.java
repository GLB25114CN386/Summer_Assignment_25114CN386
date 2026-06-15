package Day16;
import java.util.*;
public class Q63 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int var1=0,var2=0;
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum");
        int sum=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int s=a[i]+a[j];
                if(sum==s)
                {  
                    var1=a[i];
                    var2=a[j];
                }
            }
            }
        System.out.println("The pair that gives sum = "+sum+" is ("+var1+","+var2+")");
        }
}
package Day1;

import java.util.*;
public class Q1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of the numbers = " +sum);
    }
}

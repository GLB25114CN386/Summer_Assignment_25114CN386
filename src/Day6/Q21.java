package Day6;
import java.util.*;
public class Q21 {
    void bin(int n)
    {
        int idx=0;
        int rem[]=new int[32];
        if(n==0)
        {
            System.out.print(0);
        }
        if(n<0)
        {
            System.out.print("-");
            n=-n;
        }
        while(n>0)
        {
            int div=n/2;
             rem[idx]=n%2;
             n=div;
             idx++;
        }
        for(int i=idx-1;i>=0;i--)
        {
            System.out.print(rem[i]);
        }
    }
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int num=sc.nextInt();
        Q21 ob=new Q21();
        System.out.println("The number in binary form");
        ob.bin(num);
     }    
}
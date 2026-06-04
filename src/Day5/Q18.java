package Day5;
import java.util.*;
public class Q18 {
    int fact(int n)
    {
        int fact=1;
        if(n==0)
            fact=1;
        else
        {
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
      }
        return fact;
   }
    void strong(int n)
    {
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum+fact(r);
            n=n/10;
        }
        if(sum==temp)
            System.out.println("It is a Strong Number");
        else
            System.out.println("It is not a Strong Number");
    }
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Q18 ob=new Q18();
        ob.strong(num);
      }
}
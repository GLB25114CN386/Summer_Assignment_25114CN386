package Day12;
import java.util.*;
public class Q46 {
    void armstrong(int n)
    {
        int k=0;
        int temp1=n;
        int temp=n;
        int sum=0;
        while(temp1>0)
        {
            temp1=temp1/10;
            k++;
        }
        while(n>0)
        {
            int r=n%10;
            sum=sum+(int)Math.pow(r,k);
            n=n/10;
        }
        if(sum==temp)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("It is not an Armstrong Number");
    }
     public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for Armstrong");
        int num=sc.nextInt();
        Q46 ob=new Q46();    
        ob.armstrong(num);          
      }
}
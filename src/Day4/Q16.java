package Day4;
import java.util.*;

public class Q16 {
    boolean Isarmstrong(int n)
    {
        int k=0,v=0;
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
            return true;
        else
            return false;
    }
     public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower range of armstrong number");
        int r1=sc.nextInt();
        System.out.println("Enter the upper range of armstrong number");
        int r2=sc.nextInt();  
        Q16 ob=new Q16();    
          for(int i=r1;i<=r2;i++)
          {
              if(ob.Isarmstrong(i))
                  System.out.println(i);
            
          }          
      }
}
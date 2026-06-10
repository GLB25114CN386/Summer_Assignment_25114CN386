package Day11;
import java.util.*;
public class Q43 {
    boolean isPrime(int n)
    {
        int p=0;
        if(n==1)
            return true;
        else
        {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                { p=0; 
                    break;}
                else
                    p=1;
            }
        }
            if(p==1)
                return true;
            else
                return false;
    }
      public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        Q43 ob=new Q43();
        if(ob.isPrime(n1))
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}

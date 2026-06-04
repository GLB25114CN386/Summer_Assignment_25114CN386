package Day5;
import java.util.*;
public class Q17 {
    void perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
            System.out.println("It is a perfect number");
        else
            System.out.println("It is not a perfect number");
    }
       public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            Q17 ob=new Q17();
            ob.perfect(num);
        }
}
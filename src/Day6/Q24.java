package Day6
import java.util.*;
public class Q24 {
    double pow(double x,int n)
    {
        double res=1;
        while(n>0)
        {
            res=res*x;
            n--;
        }
         return res;
    }
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double num=sc.nextDouble();
        System.out.println("Enter the power of the number");
        int power=sc.nextInt();
        Q24 ob=new Q24();
        double res=ob.pow(num,power);
        System.out.println("The result = "+res);
      }
}
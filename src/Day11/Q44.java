package Day11;
import java.util.*;
public class Q44 {
    int fact(int n)
    {
        int fact=1;
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        Q44 ob=new Q44();
        int res=ob.fact(n1);
        System.out.println("The factorial of "+n1+" is "+res);
}

}
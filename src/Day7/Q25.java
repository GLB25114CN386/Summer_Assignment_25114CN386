package Day7;
import java.util.*;
public class Q25 {
    int fact(int x)
    {
        if(x==0)
            return 1;
        else
            return x*fact(x-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Q25 ob=new Q25();
        int res=ob.fact(num);
        System.out.println("The factorial of the entered number = "+res);
    }
}
package Day5;
import java.util.*;
public class Q19 {
    void factors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        Q19 ob=new Q19();
        System.out.println("The factors of "+num+" are");
        ob.factors(num);
    }
}
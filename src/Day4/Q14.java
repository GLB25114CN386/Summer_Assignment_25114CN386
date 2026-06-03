package Day4;
import java.util.*;
public class Q14 {
    void fib(int n)
    {
        int a=0,b=1,c;
        for(int i=0;i<(n-1);i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print("The term present at the input position "+a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Q14 ob=new Q14();
        System.out.println("Enter the position of Fibonacci Series at which the term is to be found");
        int num=sc.nextInt();
        ob.fib(num);
    }
}

package Day12;
import java.util.*;
public class Q47 {
    void fib(int n)
    {
        int a=0,b=1,c;
        for(int i=0;i<n;i++)
        {
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Q47 ob=new Q47();
        System.out.println("Enter the limit of Fibonacci Series");
        int num=sc.nextInt();
        ob.fib(num);
    }
}
package Day11;
import java.util.*;
public class Q41 {
    int sum(int a,int b)
    {
        int s=a+b;
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Q41 ob=new Q41();
        int res=ob.sum(n1,n2);
        System.out.println("The sum of two numbers = "+res);
    }
}
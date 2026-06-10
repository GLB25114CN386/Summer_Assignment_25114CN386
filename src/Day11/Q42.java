package Day11;
import java.util.*;
public class Q42 {
    int max(int a,int b)
    {
        if(a>b)
            return a;
        if(b>a)
            return b;
        else
            return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Q42 ob=new Q42();
        int res=ob.max(n1,n2);
        if(res==0)
            System.out.println("Both the numbers are equal");
        else
        System.out.println("The maximum of two numbers = "+res);
    }
}
package Day1;

import java.util.*;
public class Q2 {
    void product(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=sc.nextInt();
        Q2 ob=new Q2();
        System.out.println("The multiplication table of " +num);
        ob.product(num);
    }
}

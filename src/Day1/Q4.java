package Day1;

import java.util.*;
public class Q4
{
    void count(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
            System.out.println(count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=sc.nextInt();
        Q4 ob=new Q4();
        System.out.println("The number of digits in "+num+" are");
        ob.count(num);
    }
}

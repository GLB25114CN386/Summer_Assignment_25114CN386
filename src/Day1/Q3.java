package Day1;

import java.util.*;
public class Q3
{
void product(int n)
{
    int prod=1;
    for(int i=1;i<=n;i++)
    {
        prod=prod*i;
    }
     System.out.println("The factorial of "+n+" is "+prod);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter the number");
    num=sc.nextInt();
    Q3 ob=new Q3();
    ob.product(num);
}
}
package Day3;

import java.util.*;
public class Q12
{
    int gcd1(int n1,int n2)
    {
        int temp=0;
        if(n2>n1)
        {
            temp=n2;
            n2=n1;
            n1=temp;
        }
        int gcd=0;
        while(n2!=0)
        {
            int r=n1%n2;
            n1=n2;
            n2=r;
        }
        return n1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        Q11 ob= new Q11();
        int result=ob.gcd1(num1,num2);
        int lcm=Math.abs(num1*num2)/result;
        System.out.println("The Least Common Multiple "+lcm );

    }

}


package Day2;

import java.util.*;
public class Q8 {
    void rev(int n) {
        int rev = 0;
        int temp=n;
        while (n > 0) {
            int r = n % 10;
            rev = rev*10 + r;
            n = n / 10;
        }
        if(rev==temp)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Q8 ob=new Q8();
        ob.rev(num);
    }

}



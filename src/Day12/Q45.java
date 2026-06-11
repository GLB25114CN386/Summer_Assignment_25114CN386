package Day12;
import java.util.*;
public class Q45 {
    boolean isPalindrome(int n)
    {
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        Q45 ob=new Q45();
        if(ob.isPalindrome(n1))
        System.out.println("The given number is Palindrome");
        else
        System.out.println("The given number is not Palindrome");
    }
}
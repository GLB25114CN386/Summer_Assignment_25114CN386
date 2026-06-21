package Day22;
import java.util.*;
public class Q85 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string");
        s=sc.nextLine();
        String ns="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            ns=ns+c;
        }
        if(ns.equalsIgnoreCase(s))
            System.out.println("It is a Palindrome String");
        else
            System.out.println("It is not a Palindrome String");
    }
}
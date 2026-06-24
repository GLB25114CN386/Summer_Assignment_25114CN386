package Day25
import java.util.*;
public class Q98 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.nextLine().toLowerCase();
        System.out.println("Enter second string");
        String s2=sc.nextLine().toLowerCase();
        int sz=0;
        char c[]=new char[Math.min(s1.length(),s2.length())];
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    c[sz]=s1.charAt(i);
                    sz++;
                    break;
                }
            }
        }
        System.out.println("The common characters:");
        for(int k=0;k<sz;k++)
        {
            System.out.println(c[k]);
        }
    }
}
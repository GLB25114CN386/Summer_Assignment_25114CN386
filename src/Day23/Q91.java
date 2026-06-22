package Day23;
import java.util.*;
public class Q91
{
    public static void sort(char a[])
    {
        char temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s=sc.nextLine().toLowerCase();
        String k=sc.nextLine().toLowerCase();
        char c[]=s.toCharArray();
        char w[]=k.toCharArray();
        if(c.length!=w.length)
        {
            System.out.println("The strings are not anagram strings");
            return;
        }
        sort(c);
        sort(w);
        int t=1;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=w[i])
            {
                t=0;
                break;
            }
        }
        if(t==1)
            System.out.println("The given strings are anagram strings");
        else
            System.out.println("The strings are not anagram strings");
    }
}
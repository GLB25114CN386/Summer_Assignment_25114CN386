package Day24;
import java.util.*;
public class Q93 {
    public static void sort(char a[])
    {
        char temp='\u0000';
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i;j<a.length-i-1;j++)
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
        String s1,s2;
        System.out.println("Enter first String");
        s1=sc.nextLine();
        System.out.println("Enter second String");
        s2=sc.nextLine();
        if(s1.length()!=s2.length())
        {
            System.out.println("No String Rotation");
            return;
        }
        else
        {
            char c1[]=s1.toCharArray();
            char c2[]=s2.toCharArray();
            sort(c1);
            sort(c2);
            int t=1;
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]!=c2[i])
            {
                t=0;
                break;
            }
        }
        if(t==1)
            System.out.println("String Rotation Possible");
        else
            System.out.println("No String Rotation");
    }
}
}
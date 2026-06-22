package Day23;
import java.util.*;
public class Q92 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=sc.nextLine();
        char ch='\u0000';
        int count;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            count=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            if(max<count)
            {
                max=count;
                ch=s.charAt(i);
            }
        }
        System.out.println("The character with max occurences is\n"+ch);
    }
}
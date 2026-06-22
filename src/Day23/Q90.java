package Day23;
import java.util.*;
public class Q90 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=sc.nextLine();
        int count;
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
            if(count>1)
            {
                System.out.println("The first repeating character\n"+s.charAt(i));
                break;
            }
        }
    }
}
package Day24;
import java.util.*;
public class Q94 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=sc.nextLine();
        char ch='\u0000';
        int count;
        int max=0;
        count=1;
       for(int i=0;i<s.length()-1;i++)
       {
       if(s.charAt(i)==s.charAt(i+1))
        count++;
       else
       {
        System.out.print(s.charAt(i)+""+count);
        count=1;
       }
    }
        System.out.print(s.charAt(s.length()-1)+""+count);
    }
}
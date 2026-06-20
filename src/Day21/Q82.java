package Day21;
import java.util.*;
public class Q82 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String wrd;
        System.out.println("Enter a string");
        wrd=sc.nextLine();
        int k=wrd.length();
        String newwrd="";
        for(int i=k-1;i>=0;i--)
        {
            char c=wrd.charAt(i);
            newwrd=newwrd+c;
        }
        System.out.println("The reverse of the string\n"+newwrd);
    }
}

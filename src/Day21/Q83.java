package Day21;
import java.util.*;
public class Q83 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine().toLowerCase();
        int vcount=0,ccount=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                vcount++;
            else
                ccount++;
        }
         System.out.println("The number of vowels in the String = "+vcount);
         System.out.println("The number of consonants in the String = "+ccount);
    }
}
package Day21;
import java.util.*;
public class Q81 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String wrd;
        System.out.println("Enter a string");
        wrd=sc.nextLine();
        int count=0;
        try
        {
            while(true)
            {
                wrd.charAt(count);
                count++;
            }
        }
        catch(Exception e)
        {
        }
        System.out.println("The length of the string = "+count);
    }
}

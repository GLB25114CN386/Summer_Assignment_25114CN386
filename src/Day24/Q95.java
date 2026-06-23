package Day24;
import java.util.*;
public class Q95 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        String k[]=s.split(" ");
        String longest=k[0];
        for(int i=0;i<k.length;i++)
        {
            if(k[i].length()>longest.length())
                longest=k[i];
        }
        System.out.println("The longest word in the sentence\n"+longest);
    }
}
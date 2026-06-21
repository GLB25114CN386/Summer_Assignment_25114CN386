package Day22;
import java.util.*;
public class Q88 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s.trim();
        String k[]=s.split();
        
        for(int i=0;i<k.length;i++)
        {
            System.out.print(k[i]);
        }
}
}
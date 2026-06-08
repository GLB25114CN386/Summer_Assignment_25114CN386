package Day9;
import java.util.*;
public class Q35 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many lines you want to print");
        int n=sc.nextInt();
        for(int i=65;i<(65+n);i++)
        {
            for(int j=65;j<=i;j++)
            {
                System.out.print((char)i);
            }
                System.out.println(" ");
        }
    }
}

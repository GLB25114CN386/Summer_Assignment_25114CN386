package Day10;
import java.util.*;
public class Q40 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many lines you want to print");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //Ascending Numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(64+j));
            }
            //Descending Numbers
            for(int j=i-1;j>=1;j--)
            {
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}

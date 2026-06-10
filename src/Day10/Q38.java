package Day10;
import java.util.*;
public class Q38 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many lines you want to print");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            //Print Spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //Print Stars
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

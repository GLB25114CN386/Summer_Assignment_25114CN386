package Day19;
import java.util.*;
public class Q76 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the order of matrics (m*n)");
        System.out.println("Value of 'm'");
        m=sc.nextInt();
        System.out.println("Value of 'n'");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+" "); 
            }
               System.out.println(" ");
        }
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                sum=sum+a[i][j];
            }
        }
        System.out.println("The sum of Diagonal Elements = "+sum);
    }
}
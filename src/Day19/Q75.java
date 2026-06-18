package Day19;
import java.util.*;
public class Q75 {
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
        System.out.println("Enter the matrix elements");
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
        int b[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        System.out.println("The Transpose of Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(b[i][j]+" "); 
            }
               System.out.println(" ");
        }
    }
}
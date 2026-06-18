package Day19;
import java.util.*;
public class Q74 {
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
        System.out.println("Enter first array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]=new int[m][n];
        System.out.println("Enter second array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("Matrix After Subtraction");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(c[i][j]+" "); 
            }
               System.out.println(" ");
        }
    }
}
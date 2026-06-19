package Day20;
import java.util.*;
public class Q77 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,m1,n1;
        System.out.println("Enter the order of matrics");
        System.out.println("Value of Rows");
        m=sc.nextInt();
        System.out.println("Value of Columns");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the order of matrics");
        System.out.println("Value of Rows");
        m1=sc.nextInt();
        System.out.println("Value of Columns");
        n1=sc.nextInt();
        if(n!=m1)
            System.out.println("Matrix Multiplication Not Possible");
        else
        {
        System.out.println("Enter first matrix elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]=new int[m1][n1];
        System.out.println("Enter second matrix elements");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[m][n1];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n1;j++)
            {
                c[i][j]=0;
                for(int k=0;k<n;k++)
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
        }
        System.out.println("Matrix After Multiplication");
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
}
package Day20;
import java.util.*;
public class Q78 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the order of matrics");
        System.out.println("Value of Rows");
        m=sc.nextInt();
        System.out.println("Value of Columns");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        if(m!=n)
        System.out.println("It is not a symmetric matrix");
        else
        {
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
            for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int k=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=a[j][i])
                { 
                   k=-1;
                   break;
                }
            }
        }
        if(k==1)
            System.out.println("It is a symmetric matrix");
        else
            System.out.println("It is not a symmetric matrix");
    }
}
}
        
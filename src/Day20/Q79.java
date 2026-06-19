package Day20;
import java.util.*;
public class Q79 {
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
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
            System.out.println("Input Matrix");
            for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int rsum;
        for(int i=0;i<m;i++)
        {
            rsum=0;
            for(int j=0;j<n;j++)
            {
                rsum=rsum+a[i][j];
            }
            System.out.println("Row wise sum of matrix = "+rsum);
        }
    }
}

        
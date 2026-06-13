package Day15;
import java.util.*;
public class Q60 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int ecount=0, zerocount=0;
        for (int i=0;i<n;i++) {
            if (a[i]!=0)
                ecount++;
            else
                zerocount++;
        }
        int b[]=new int[ecount];
        int c[]=new int[zerocount];
        int bi = 0, ci = 0;
        for (int i=0;i<n;i++) {
            if (a[i]!=0)
                b[bi++]=a[i];
            else
                c[ci++]=a[i];
        }
        int d[]=new int[ecount+zerocount];
        for (int i=0;i<ecount;i++) {
            d[i]=b[i];
        }

        for (int i=0;i<zerocount;i++) {
            d[ecount+i]=c[i];
        }
        System.out.println("The new array:");
        for (int i=0; i<d.length;i++) {
            System.out.println(d[i]);
        }
    }
}
package Day6;
import java.util.*;
public class Q22 {
    int dec(long n)
    {
        int dec=0;
        int k=0;
        while(n>0)
        {
            long rem=n%10;
            dec=dec+(int)rem*(int)Math.pow(2,k);
            k++;
            n=n/10;
        }
        return dec;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number");
        long num=sc.nextLong();
        Q22 ob=new Q22();
        int res=ob.dec(num);
        System.out.println("The number in decimal form "+res);
    }
}
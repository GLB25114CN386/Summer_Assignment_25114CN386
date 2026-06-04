package Day5;
import java.util.*;
public class Q20 {
    boolean isPrime(int n) {
        if (n<2)
            return false;
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
    int largestPrimeFactor(int n) {
        int max=0;
        for (int i=1;i<=n;i++) {
            if (n%i==0 && isPrime(i) && i>max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        Q20 ob=new Q20();
        System.out.println("The largest prime factor of " + num + " is "+ob.largestPrimeFactor(num));
    }
}
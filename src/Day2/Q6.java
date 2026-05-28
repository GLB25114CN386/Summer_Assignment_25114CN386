package Day2;
import java.util.*;
public class Q6 {
    void rev(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev*10 + r;
            n = n / 10;
        }
        System.out.println(rev);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Q6 ob=new Q6();
        System.out.println("The reverse of the number is");
        ob.rev(num);
    }

}


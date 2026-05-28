package Day2;
import java.util.*;
public class Q5 {
    void sum(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
            System.out.println(sum);
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            Q5 ob=new Q5();
            System.out.println("The sum of digits of the number");
            ob.sum(num);
        }

    }


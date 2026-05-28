package Day2;
import java.util.*;
public class Q7 {
    void prod(int n) {
        int prod = 1;
        while (n > 0) {
            int r = n % 10;
            prod = prod * r;
            n = n / 10;
        }
        System.out.println(prod);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Q7 ob=new Q7();
        System.out.println("The product of digits of the number");
        ob.prod(num);
    }

}


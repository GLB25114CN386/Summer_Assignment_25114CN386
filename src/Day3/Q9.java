package Day3;
import java.util.*;
public class Q9
    {
        void prime(int n) {
            int p=0;
            if (n == 1)
                p = 1;
            else {
                for (int i = 2; i<=n/2;i++){
                    if (n % i ==0)
                    {   p=0;
                        break;
                        }
                    else
                        p =1;
                }
            }
            if (p == 1)
                System.out.println("The number is prime");
            if(p==0)
                System.out.println("The number is not prime");
        }
            public static void main(String args[])
            {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter a number");
                    int num=sc.nextInt();
                    Q9 ob= new Q9();
                    ob.prime(num);
            }

    }

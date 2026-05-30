package Day3;
import java.util.*;
public class Q10
    {
        void prime(int l,int u)
        {
            for (int j = l; j <= u; j++) {
                boolean isPrime=true;
             for (int i = 2; i <= j/2; i++) {
                    if (j % i == 0)
                        isPrime=false;
                }
                    if(isPrime)
                        System.out.println(j);
            }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the lower limit");
            int lnum=sc.nextInt();
            System.out.println("Enter the upper limit");
            int unum=sc.nextInt();
            Q10 ob= new Q10();
            System.out.println("The Prime Numbers are");
            ob.prime(lnum,unum);
        }

    }



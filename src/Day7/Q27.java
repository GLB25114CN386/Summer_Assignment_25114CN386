package Day7;
import java.util.*;
public class Q27 {
    int sum(int x)
    {
        if(x<=0)
            return 0;
        else
            return (x%10)+sum(x/10);
    }
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Q27 ob=new Q27();
        int res=ob.sum(num);
        System.out.println("The sum of digits of the entered number = "+res);
    }
}
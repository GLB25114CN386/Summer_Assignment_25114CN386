package Day7;
import java.util.*;
public class Q28 {
    void rev(int x)
    {
        if(x==0)
            return;
        else
        {
            System.out.print(x%10);
            rev(x/10);
        }
    }
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Q28 ob=new Q28();
        System.out.println("The reverse of the entered number");
        ob.rev(num);
    }
}
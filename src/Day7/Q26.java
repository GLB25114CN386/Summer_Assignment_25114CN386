package Day7;
import java.util.*;
public class Q26 {
    int fib(int x)
    {
        if(x==0)
            return 0;
        if(x==1)
            return 1;
        else
            return fib(x-1)+fib(x-2);
    }
      public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end limit of fibonnaci sequnece");
        int num=sc.nextInt();
        Q26 ob=new Q26();
        System.out.println("The fibonacci sequence for the entered limit");
        for(int i=0;i<=num;i++)
          {
           System.out.print(ob.fib(i)+" , ");
          }
      }
}

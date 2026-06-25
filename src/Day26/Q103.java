package Day26;
import java.util.*;
public class Q103 {
    static int bal=10000;
    public static void balance()
    {
        System.out.println("Current Balance: "+bal);
    }
    public static void deposit(int x)
    {
        bal=bal+x;
        System.out.println("Deposit Successful");
    }
    public static void withdraw(int x)
    {
        if(x<=bal)
        {
            bal=bal-x;
        System.out.println("Withdrawal Successful");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        while(run)
        {
        System.out.print("ATM MENU\n");
        System.out.print("1. Check Balance\n");
        System.out.print("2. Deposit\n");
        System.out.print("3. Withdraw\n");
        System.out.print("4. Exit\n");
        System.out.println("Enter your choice");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            balance();
            break;
            case 2:
            System.out.print("Enter amount: ");
            int amt=sc.nextInt();
            deposit(amt);
            break;
            case 3:
            System.out.print("Enter amount: ");
            int amt1=sc.nextInt();
            withdraw(amt1);
            break;
            case 4:
            System.out.println("Thank You for Using ATM");
            run=false;
            break;
            default:
            System.out.println("Invalid Choice");
        }
      }
    }
}
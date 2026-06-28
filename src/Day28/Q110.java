package Day28;
import java.util.*;
public class Q110{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> accounts=new ArrayList<>();
        ArrayList<Integer> balance=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== BANK ACCOUNT MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Update Account Name");
            System.out.println("7. Delete Account");
            System.out.println("8. Check Balance");
            System.out.println("9. Display All Balances");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                System.out.print("Enter Account Holder Name: ");
                String name=sc.nextLine();
                System.out.print("Enter Initial Balance: ");
                int bal=sc.nextInt();
                sc.nextLine();
                accounts.add(name);
                balance.add(bal);
                System.out.println("Account Created Successfully");
                break;

                case 2:
                if(accounts.size()==0)
                {
                    System.out.println("No Accounts Found");
                }
                else
                {
                    for(int i=0;i<accounts.size();i++)
                    {
                        System.out.println((i+1)+". "+accounts.get(i));
                    }
                }
                break;

                case 3:
                System.out.print("Enter Account Holder Name: ");
                String search=sc.nextLine();
                if(accounts.contains(search))
                {
                    System.out.println("Account Found");
                }
                else
                {
                    System.out.println("Account Not Found");
                }
                break;

                case 4:
                System.out.print("Enter Account Holder Name: ");
                String dep=sc.nextLine();
                if(accounts.contains(dep))
                {
                    int index=accounts.indexOf(dep);
                    System.out.print("Enter Amount: ");
                    int amt=sc.nextInt();
                    sc.nextLine();
                    balance.set(index,balance.get(index)+amt);
                    System.out.println("Amount Deposited Successfully");
                }
                else
                {
                    System.out.println("Account Not Found");
                }
                break;

                case 5:
                System.out.print("Enter Account Holder Name: ");
                String with=sc.nextLine();
                if(accounts.contains(with))
                {
                    int index=accounts.indexOf(with);
                    System.out.print("Enter Amount: ");
                    int amt=sc.nextInt();
                    sc.nextLine();
                    if(balance.get(index)>=amt)
                    {
                        balance.set(index,balance.get(index)-amt);
                        System.out.println("Amount Withdrawn Successfully");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                }
                else
                {
                    System.out.println("Account Not Found");
                }
                break;

                case 6:
                System.out.print("Enter Old Account Name: ");
                String old=sc.nextLine();
                if(accounts.contains(old))
                {
                    int index=accounts.indexOf(old);
                    System.out.print("Enter New Account Name: ");
                    String ne=sc.nextLine();
                    accounts.set(index,ne);
                    System.out.println("Account Updated Successfully");
                }
                else
                {
                    System.out.println("Account Not Found");
                }
                break;

                case 7:
                System.out.print("Enter Account Holder Name: ");
                String del=sc.nextLine();
                if(accounts.contains(del))
                {
                    int index=accounts.indexOf(del);
                    accounts.remove(index);
                    balance.remove(index);
                    System.out.println("Account Deleted Successfully");
                }
                else
                {
                    System.out.println("Account Not Found");
                }
                break;

                case 8:
                System.out.print("Enter Account Holder Name: ");
                String check=sc.nextLine();
                if(accounts.contains(check))
                {
                    int index=accounts.indexOf(check);
                    System.out.println("Balance: "+balance.get(index));
                }
                else
                {
                    System.out.println("Account Not Found");
                }
                break;

                case 9:
                if(accounts.size()==0)
                {
                    System.out.println("No Accounts Found");
                }
                else
                {
                    for(int i=0;i<accounts.size();i++)
                    {
                        System.out.println(accounts.get(i)+" : "+balance.get(i));
                    }
                }
                break;

                case 10:
                System.out.println("Thank You");
                b=false;
                break;

                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
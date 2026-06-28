package Day28;
import java.util.*;
public class Q111{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> available=new ArrayList<>();
        ArrayList<String> booked=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Add Ticket");
            System.out.println("2. Display Available Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Book Ticket");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Update Ticket");
            System.out.println("7. Delete Ticket");
            System.out.println("8. Display Available Tickets");
            System.out.println("9. Display Booked Tickets");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                System.out.print("Enter Ticket Name: ");
                String ticket=sc.nextLine();
                available.add(ticket);
                System.out.println("Ticket Added Successfully");
                break;

                case 2:
                if(available.size()==0)
                {
                    System.out.println("No Tickets Available");
                }
                else
                {
                    System.out.println("Available Tickets:");
                    for(int i=0;i<available.size();i++)
                    {
                        System.out.println((i+1)+". "+available.get(i));
                    }
                }
                break;

                case 3:
                System.out.print("Enter Ticket Name: ");
                String search=sc.nextLine();
                if(available.contains(search)||booked.contains(search))
                {
                    System.out.println("Ticket Found");
                }
                else
                {
                    System.out.println("Ticket Not Found");
                }
                break;

                case 4:
                System.out.print("Enter Ticket Name: ");
                String book=sc.nextLine();
                if(available.contains(book))
                {
                    available.remove(book);
                    booked.add(book);
                    System.out.println("Ticket Booked Successfully");
                }
                else
                {
                    System.out.println("Ticket Not Available");
                }
                break;

                case 5:
                System.out.print("Enter Ticket Name: ");
                String cancel=sc.nextLine();
                if(booked.contains(cancel))
                {
                    booked.remove(cancel);
                    available.add(cancel);
                    System.out.println("Ticket Cancelled Successfully");
                }
                else
                {
                    System.out.println("Ticket Was Not Booked");
                }
                break;

                case 6:
                System.out.print("Enter Ticket Name To Update: ");
                String old=sc.nextLine();
                if(available.contains(old))
                {
                    int index=available.indexOf(old);
                    System.out.print("Enter New Ticket Name: ");
                    String ne=sc.nextLine();
                    available.set(index,ne);
                    System.out.println("Ticket Updated Successfully");
                }
                else
                {
                    System.out.println("Ticket Not Found");
                }
                break;

                case 7:
                System.out.print("Enter Ticket Name To Delete: ");
                String del=sc.nextLine();
                if(available.remove(del))
                {
                    System.out.println("Ticket Deleted Successfully");
                }
                else
                {
                    System.out.println("Ticket Not Found");
                }
                break;

                case 8:
                if(available.size()==0)
                {
                    System.out.println("No Available Tickets");
                }
                else
                {
                    System.out.println("Available Tickets:");
                    for(String s:available)
                    {
                        System.out.println(s);
                    }
                }
                break;

                case 9:
                if(booked.size()==0)
                {
                    System.out.println("No Booked Tickets");
                }
                else
                {
                    System.out.println("Booked Tickets:");
                    for(String s:booked)
                    {
                        System.out.println(s);
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
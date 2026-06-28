package Day28;
import java.util.*;
public class Q112{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> numbers=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Search Phone Number");
            System.out.println("7. Update Phone Number");
            System.out.println("8. Display Contact Count");
            System.out.println("9. Delete All Contacts");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                System.out.print("Enter Contact Name: ");
                String name=sc.nextLine();
                System.out.print("Enter Phone Number: ");
                String num=sc.nextLine();
                names.add(name);
                numbers.add(num);
                System.out.println("Contact Added Successfully");
                break;

                case 2:
                if(names.size()==0)
                {
                    System.out.println("No Contacts Found");
                }
                else
                {
                    System.out.println("Contacts:");
                    for(int i=0;i<names.size();i++)
                    {
                        System.out.println((i+1)+". "+names.get(i)+" - "+numbers.get(i));
                    }
                }
                break;

                case 3:
                System.out.print("Enter Contact Name: ");
                String search=sc.nextLine();
                if(names.contains(search))
                {
                    int index=names.indexOf(search);
                    System.out.println("Name: "+names.get(index));
                    System.out.println("Phone: "+numbers.get(index));
                }
                else
                {
                    System.out.println("Contact Not Found");
                }
                break;

                case 4:
                System.out.print("Enter Old Contact Name: ");
                String old=sc.nextLine();
                if(names.contains(old))
                {
                    int index=names.indexOf(old);
                    System.out.print("Enter New Contact Name: ");
                    String ne=sc.nextLine();
                    names.set(index,ne);
                    System.out.println("Contact Updated Successfully");
                }
                else
                {
                    System.out.println("Contact Not Found");
                }
                break;

                case 5:
                System.out.print("Enter Contact Name: ");
                String del=sc.nextLine();
                if(names.contains(del))
                {
                    int index=names.indexOf(del);
                    names.remove(index);
                    numbers.remove(index);
                    System.out.println("Contact Deleted Successfully");
                }
                else
                {
                    System.out.println("Contact Not Found");
                }
                break;

                case 6:
                System.out.print("Enter Contact Name: ");
                String find=sc.nextLine();
                if(names.contains(find))
                {
                    int index=names.indexOf(find);
                    System.out.println("Phone Number: "+numbers.get(index));
                }
                else
                {
                    System.out.println("Contact Not Found");
                }
                break;

                case 7:
                System.out.print("Enter Contact Name: ");
                String update=sc.nextLine();
                if(names.contains(update))
                {
                    int index=names.indexOf(update);
                    System.out.print("Enter New Phone Number: ");
                    String newNum=sc.nextLine();
                    numbers.set(index,newNum);
                    System.out.println("Phone Number Updated Successfully");
                }
                else
                {
                    System.out.println("Contact Not Found");
                }
                break;

                case 8:
                System.out.println("Total Contacts: "+names.size());
                break;

                case 9:
                names.clear();
                numbers.clear();
                System.out.println("All Contacts Deleted Successfully");
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
package Day29;
import java.util.*;
public class Q116 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> items=new ArrayList<>();
        boolean b=true;

        while(b)
        {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Search Item");
            System.out.println("4. Display Inventory");
            System.out.println("5. Count Items");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();

            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter Item Name: ");
                    String item=sc.nextLine();
                    items.add(item);
                    System.out.println("Item Added Successfully");
                    break;
                }

                case 2:
                {
                    System.out.print("Enter Item Name to Remove: ");
                    String item=sc.nextLine();
                    if(items.remove(item))
                        System.out.println("Item Removed Successfully");
                    else
                        System.out.println("Item Not Found");
                    break;
                }

                case 3:
                {
                    System.out.print("Enter Item Name to Search: ");
                    String item=sc.nextLine();
                    if(items.contains(item))
                        System.out.println("Item Found");
                    else
                        System.out.println("Item Not Found");
                    break;
                }

                case 4:
                {
                    if(items.isEmpty())
                        System.out.println("Inventory is Empty");
                    else
                    {
                        System.out.println("Inventory Items:");
                        for(String item:items)
                            System.out.println(item);
                    }
                    break;
                }

                case 5:
                {
                    System.out.println("Total Items = "+items.size());
                    break;
                }

                case 6:
                {
                    b=false;
                    System.out.println("Exiting...");
                    break;
                }

                default:
                {
                    System.out.println("Invalid Choice");
                }
            }
        }
        sc.close();
    }
}
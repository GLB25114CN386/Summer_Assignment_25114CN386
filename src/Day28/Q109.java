package Day28;
import java.util.*;
public class Q109 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> books=new ArrayList<>();
        ArrayList<String> issuedBooks=new ArrayList<>();
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Books");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Update Book");
            System.out.println("7. Delete Book");
            System.out.println("8. Display Available Books");
            System.out.println("9. Display Issued Books");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                System.out.print("Enter book name: ");
                    String book=sc.nextLine();
                    books.add(book);
                    System.out.println("Book Added Successfully.");
                    break;
                case 2:
                if(books.size()==0)
                {
                    System.out.println("No Books Found");
                }
                else
                {
                    System.out.println("Books List:");
                    for(int i=0;i<books.size();i++)
                    {
                      System.out.println((i+1)+". "+books.get(i));
                    }
                }
                break;
                case 3:
                System.out.println("Enter book name");
                String search=sc.nextLine();
                if(books.contains(search))
                {
                    System.out.println("Book Found");
                }
                else
                    System.out.println("Book Not Found");
                break;
                case 4:
                System.out.print("Enter Book Name: ");
                String issue=sc.nextLine();
                if(books.contains(issue))
                {
                    books.remove(issue);
                    issuedBooks.add(issue);
                    System.out.println("Book Issued Successfully");
                }
                else
                {
                    System.out.println("Book Not Found");
                }
                break;
                case 5:
                System.out.print("Enter Book Name: ");
                String ret=sc.nextLine();
                if(issuedBooks.contains(ret))
                {
                    issuedBooks.remove(ret);
                    books.add(ret);
                    System.out.println("Book Returned Successfully");
                }
                else
                {
                    System.out.println("Book Was Not Issued");
                }
                break;
                case 6:
                System.out.print("Enter Book Name To Update: ");
                String oldBook=sc.nextLine();
                if(books.contains(oldBook))
                {
                    System.out.print("Enter New Book Name: ");
                    String newBook=sc.nextLine();
                    int index=books.indexOf(oldBook);
                    books.set(index,newBook);
                    System.out.println("Book Updated Successfully");
                }
                else
                {
                    System.out.println("Book Not Found");
                }
                break;
                case 7:
                System.out.print("Enter Book Name To Delete: ");
                String del=sc.nextLine();
                if(books.remove(del))
                {
                    System.out.println("Book Deleted Successfully");
                }
                else
                {
                    System.out.println("Book Not Found");
                }
                break;
                case 8:
                if(books.size()==0)
                {
                    System.out.println("No Available Books");
                }
                else
                {
                    System.out.println("Available Books:");
                    for(String s:books)
                    {
                        System.out.println(s);
                    }
                }
                break;
                case 9:
                if(issuedBooks.size()==0)
                {
                    System.out.println("No Issued Books");
                }
                else
                {
                    System.out.println("Issued Books:");
                    for(String s:issuedBooks)
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

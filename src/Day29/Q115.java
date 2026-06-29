package Day29;
import java.util.*;
public class Q115 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        while(b)
        {
            System.out.println("\n===== STRING OPERATIONS SYSTEM =====");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Count Vowels");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            sc.nextLine();

            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter a String: ");
                    String s=sc.nextLine();
                    System.out.println("Length = "+s.length());
                    break;
                }

                case 2:
                {
                    System.out.print("Enter a String: ");
                    String s=sc.nextLine();
                    System.out.println("Uppercase String = "+s.toUpperCase());
                    break;
                }

                case 3:
                {
                    System.out.print("Enter a String: ");
                    String s=sc.nextLine();
                    System.out.println("Lowercase String = "+s.toLowerCase());
                    break;
                }

                case 4:
                {
                    System.out.print("Enter a String: ");
                    String s=sc.nextLine();
                    String rev="";
                    for(int i=s.length()-1;i>=0;i--)
                    {
                        rev=rev+s.charAt(i);
                    }
                    System.out.println("Reversed String = "+rev);
                    break;
                }

                case 5:
                {
                    System.out.print("Enter a String: ");
                    String s=sc.nextLine();
                    String rev="";
                    for(int i=s.length()-1;i>=0;i--)
                    {
                        rev=rev+s.charAt(i);
                    }
                    if(s.equalsIgnoreCase(rev))
                        System.out.println("Palindrome String");
                    else
                        System.out.println("Not a Palindrome String");
                    break;
                }

                case 6:
                {
                    System.out.print("Enter a String: ");
                    String s=sc.nextLine();
                    int count=0;
                    for(int i=0;i<s.length();i++)
                    {
                        char c=Character.toLowerCase(s.charAt(i));
                        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                            count++;
                    }
                    System.out.println("Number of Vowels = "+count);
                    break;
                }

                case 7:
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
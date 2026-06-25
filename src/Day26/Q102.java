package Day26;
import java.util.*;
public class Q102 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age=sc.nextInt();
        if(age<18)
            System.out.println("You are not elgible for voting.");
        if(age>=18)
            System.out.println("You are eligible for voting.");
    }
}
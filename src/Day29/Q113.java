package Day29;
import java.util.*;
public class Q113 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        System.out.println("Enter operation +,-,*,/ you want to perform");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case'+':
            System.out.println("The sum = "+(n1+n2));
            break;
            case'-':
            System.out.println("The difference = "+Math.abs((n1-n2)));
            break;
            case'*':
            System.out.println("The product = "+(n1*n2));
            break;
            case'/':
            System.out.println("The division = "+(n1/n2));
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}
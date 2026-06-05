package Day6;
import java.util.*;
public class Q23
{
int count(int n)
{
    int cnt = 0;
    while(n > 0)
    {
        if(n % 2 == 1)
            cnt++;
        n = n / 2;
    }
    return cnt;
}
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    Q23 ob = new Q23();
    System.out.println("Number of set bits = "+ ob.count(num));
}
}
package Day22;
import java.util.*;
public class Q87 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=sc.nextLine();
        char c[]=s.toCharArray();
        boolean visited[]=new boolean[c.length];
        int count=0;
        for(int i=0;i<c.length;i++)
        {
            if(visited[i]==true)
            {
                continue;
            }
                count=1;
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(c[i]+" "+count);
        }
    }
}
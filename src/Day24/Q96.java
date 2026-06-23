package Day24;
import java.util.*;
public class Q96 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a string");
        s=sc.nextLine();
        char c[]=s.toCharArray();
        boolean visited[]=new boolean[c.length];
        for(int i=0;i<c.length;i++)
        {
            if(visited[i]==true)
            {
                continue;
            }
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    visited[j]=true;
                }
            }
            System.out.print(c[i]);
    }
  }
}
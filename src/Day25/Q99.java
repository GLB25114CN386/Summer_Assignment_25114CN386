package Day25;
import java.util.*;
public class Q99 {
    public static void sort(String a[])
    {
        String temp="";
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i;j<a.length-i-1;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of names you want to enter");
            int n=sc.nextInt();
            String nm[]=new String[n+1];
            System.out.println("Enter the names");
            for(int i=0;i<n+1;i++)
            {
                nm[i]=sc.nextLine();
            }
            sort(nm);
            System.out.println("Names in alphabetical order:");
            for(int i=0;i<n+1;i++)
            {
                System.out.println(nm[i]);
            }
    }
}

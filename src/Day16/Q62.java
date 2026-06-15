package Day16;
import java.util.*;
public class Q62 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                    count[i]++;
            }
        }
        int max=0,pos=0;
        for(int i=0;i<n;i++)
        {
            if(max<count[i])
            {  max=count[i];
                pos=i;
            }
        }
        System.out.println("The maximum frequency element is:" +a[pos]);
    }
}
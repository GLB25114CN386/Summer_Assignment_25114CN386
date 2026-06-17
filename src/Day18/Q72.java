package Day18;
import java.util.*;
public class Q72 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0,temp=0;
        //Selection Sorting
        for(int i=0;i<n;i++)
        {
                max=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[max]<arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[max];
                    arr[max]=temp;
                }
            }
        }
          System.out.println("Sorted Array In Descending Order");
          for(int i=0;i<n;i++)
          {
            System.out.println(arr[i]);
          }
      }
}
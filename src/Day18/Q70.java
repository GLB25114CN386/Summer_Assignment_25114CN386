package Day18;
import java.util.*;
public class Q70 {
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
        int min=0,temp=0;
        //Selection Sorting
        for(int i=0;i<n;i++)
        {
                min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    temp=arr[j];
                    arr[j]=arr[min];
                    arr[min]=temp;
                }
            }
        }
          System.out.println("Sorted Array Using Selection Sort Technique");
          for(int i=0;i<n;i++)
          {
            System.out.println(arr[i]);
          }
      }
}
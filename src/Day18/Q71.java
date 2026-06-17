package Day18;
import java.util.*;
public class Q71 {
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
        System.out.println("Enter the element to be found");
        int num=sc.nextInt();
        int min=0,max=n-1;
        int k=0;
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(num<arr[mid])
            {
                max=mid-1;
            }
            else if(num>arr[mid])
            {
                min=mid+1;
            }
            else
            {
                k=1;
                System.out.println("Element found at index "+mid);
                break;
            }
        }
        if(k==0)
        {
            System.out.println("Element not found");
        }
    }
}
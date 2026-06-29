package Day29;
import java.util.*;
public class Q114 {
    public static int sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
           return sum;
    }
    public static int product(int arr[])
    {
        int prod=1;
        for(int i=0;i<arr.length;i++)
        {
            prod=prod*arr[i];
        }
           return prod;
    }
    public static int max(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
           return max;
    }
    public static int min(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
           return min;
    }
    public static void search(int arr[],int sr)
    {
        int pos=0,j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sr==arr[i])
            {
                j=1;
                pos=i;
                break;
            }
            else
                j=0;
        }
        if(j==1)
            System.out.println("Element found at "+(pos+1));
        if(j==0)
            System.out.println("Element not found");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean b=true;
        while(b)
        {
        System.out.println("\n====Enter operations you want to perform on array====");
        System.out.println("1.Enter 1 to print the sum of array");
        System.out.println("2.Enter 2 to print the product of array");
        System.out.println("3.Enter 3 to find the largest element in the array");
        System.out.println("4.Enter 4 to find the smallest element in the array");
        System.out.println("5.Enter 5 to search an element in the array");
        System.out.println("6.Enter 6 to exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1 :
            System.out.println("The sum = "+sum(a));
            break;
            case 2:
            System.out.println("The product = "+product(a));
            break;
            case 3:
            System.out.println("The largest element = "+max(a));
            break;
            case 4:
            System.out.println("The minimum element = "+min(a));
            break;
            case 5:
            System.out.println("Enter element to be searched");
            int num=sc.nextInt();
            search(a,num);
            break;
            case 6:
            System.out.println("Thank you");
            b=false;
            break;
            default:
            System.out.println("Invalid Choice");
        }
        }
    }
}
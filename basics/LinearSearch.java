package company.dsa.basics;
import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //size of array
        System.out.print("enter the size of the array: ");
        int s = sc.nextInt();
        //initializing array
        int[] arr =new int[s];
        System.out.println("enter "+s+" elements");
        //input elements
        for (int i = 0;i<s;i++ )
        {
            arr[i] = sc.nextInt();
        }
        //element to search
        System.out.println("enter the element you want to search");
        int x = sc.nextInt();

        int index=search(arr,x);
        System.out.println("element "+x+" found "+"at index "+index);
    }
    static int search(int[] arr, int x)
    {
        if (arr.length==0)
        {
            return -1;
        }
        //linear search
        for (int i=0;i<arr.length;i++)
        {
            if (x==arr[i])
            {
                int  index=i+1;
                return index;
            }
        }
        return -1;
    }
}
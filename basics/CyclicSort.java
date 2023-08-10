package company.dsa.basics;
import java.util.ArrayList;
import java.util.Arrays;
public class CyclicSort
{
    public static void main(String[] a)
    {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(cyclicSort(arr));
    }
    static ArrayList<Integer> cyclicSort(int[] arr)
    {
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int i = 0;
//        int[] arr2 =new int[arr.length];
        while (i < arr.length )
        {

            /*
            if(arr[i]!=arr[arr[i]-1]
            {
                swap(arr,i,arr[i]-1);
             */
            //OR
            if (arr[i]!=i+1)
            {
                int ind=arr[arr[i]-1];

                if(arr[i]==ind)
                {
                    arr2.add(ind);
                    i++;
                }
                else
                {
                    //swapping
                    int a=arr[i]-1;
                    int b=arr[a];
                    int c=arr[i];
                    arr[i]=b;
                    arr[a]=c;
                }
                }
            else
            {
                i++;
            }

        }
        return (arr2);
    }
}


//    {
//        //starts from element 0
//        for(int i=0;i<arr.length-1;i++)
//        {
//            //checks whether the ith element value is i+1 or not
//            if(arr[i]!=i+1)
//            {
//                // if not, swaps the element to  element value -1 index < -- >
//                int temp=arr[i]-1;
//                int k=arr[temp];
//                arr[temp]=arr[i];
//                arr[i]=k;
//                i=-1;
//            }
//            // else the loop continues
//        }
//        return arr;
//    }
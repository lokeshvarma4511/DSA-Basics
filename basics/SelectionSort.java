package company.dsa;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] sar)
    {
        int[] arr = {67, 34, 100, -235, 9, 0, -199};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr)
    {
        int end=arr.length;
        /*
        selection sort only need one iteration
         */
        for(int i=0;i<arr.length-1;i++)
        {
            //end for decreasing the array after every iteration
            end--;
            //for finding max element between the indexes
            int max=max(arr,0,end);
            //swapping max index element  and end index element of the specified array size
            swap(arr,max,end);
        }
        return arr;
    }

    //swapping
    static void swap(int[] arr,int max,int end) {
        int temp=arr[max];
        arr[max]=arr[end];
        arr[end]=temp;
    }
    //function for finding max element in remaining array
    static int max(int[] arr,int start,int end)
    {

        int maxEle = Integer.MIN_VALUE;
        int maxindex=-1;
        for(int i=0;i<end;i++)
        {
            if(arr[i]> maxEle)
            {
                maxEle =arr[i];
                maxindex=i;

            }
        }
        return maxindex;
    }
}
package company.dsa.basics;
import java.util.Arrays;
public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr = {84,65,59,40,37,28,19,7};
        System.out.println(Arrays.toString(insertionsort(arr)));
    }

    static int[] insertionsort(int[] arr)
    {
        //this loop is for array size incrementation
        /*
        i starts from oth index and increases because all the elements should be sorted
        j iterates from  i+1th element to i-1th element
         */
        for (int i=0;i<arr.length-1;i++)
        {
            //this loop is for checking(swapping or not) every 2 elements in the given
            // -sub array from end to 0th index
            for(int j=i+1;j>0;j--)
            {
                //if jth element is <j-1, they should be swapped
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                // if not, no need to check for remining left side elements because
                // -they are alredy sorted
                else
                {
                    break;
                }
            }
        }
        return arr;
    }
//swaps the elements
    static int[] swap(int[] arr,int x,int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }
}
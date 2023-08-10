package company.dsa.basics;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] a) {
        int[] arr = {4, 0, 1, 2};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length)
        {
            if (arr[i] != i && arr[i]  <  arr.length) {
                swap(arr, arr[i], i) ;
            }
            else
            {
                i++;
            }
        }
        int j=0;
        for( j=0;j<=arr.length;j++)
        {
            if(arr[j]!=j)
                return j;
        }
        return j;
    }

    ///swap
    static int[] swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }
}







//
//            //starts from element 0
//            for(int i=0;i<arr.length-1;i++)
//            {
//                //checks whether the ith element value is i+1 or not
//                if(arr[i]!=i+1)
//                {
//                    // if not, swaps the element to element value -1 index < -- >
//                    int temp=arr[i]-1;
//                    int k=arr[temp];
//                    arr[temp]=arr[i];
//                    arr[i]=k;
//                    i=-1;
//                }
//                // else the loop continues
//            }
//for( j=0;j<=arr.length;j++)
//        {
//        if(arr[j]!=j)
//        return j;
//        }
//            return arr;
//        }
//
//    }
//}
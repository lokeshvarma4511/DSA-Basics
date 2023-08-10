package company.dsa.basics;
import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] ar){
        int[] arr= {1,2,7,4,5};
        System.out.println(Arrays.toString(swap(arr)));
    }
    static int[] swap(int[] arr){


        //normal bubble swapping


//        //outer loop
//        for (int i= 0;i<arr.length;i++)
//        {
//            //inner loop
//            for(int j=0;j<arr.length-1;j++){
//                if(arr[j]>arr[j+1])
//                {
//                    //swapping
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1]=temp;
//                }
//            }
//        }

        //initializing a boolean variable which shows if the first
        //iteration doesn't performed any swapping then else iterations also doesn't need.
        //outer loop
        boolean bool = false;
        for (int i= 0;i<arr.length;i++)
        {
            //inner loop
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1])
                {
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1]=temp;
                    bool=true;
                }
            }
            if(!bool)
            {
                break;
            }
        }
        return arr;
    }
}
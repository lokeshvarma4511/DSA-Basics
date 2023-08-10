package company.dsa.basics;

public class CelingBinSear
{
    public static void main(String[] args)
    {
        int[] arr={3,7,9,12,19,24,28,32,38,40,43,62,89,99};
        int tg=235;
        System.out.println(ceilSearch(arr,tg));
    }
    // returns the smallest number which is greater than or equal to target
    static int ceilSearch(int[] arr, int tg)
    {
        // returns -1 if the target number is greater than greater element in array
        if(tg>=arr[arr.length-1])
        {
            return -1;
        }
        //returns index 0 if the target element is lesser than smallest number in the array
        if(tg<=arr[0])
        {
            return 0;
        }
        int start=0;
        int end=arr.length;
        if(arr.length<=0)
        {
            return -1;
        }
        while(start<=end)
        {
            int mid= start+ (end-start)/2;
            if(arr[mid]==tg)
            {
                return mid;
            }
            else if(tg<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
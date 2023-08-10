package company.dsa.basics;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr={3,7,9,12,19,24,28,32,38,40,43,56,62,89,99};
        int tg=45;
        System.out.println(binarySearch(arr,tg));
    }
    static int binarySearch(int[] arr, int tg)
    {
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
        return -1;
    }
}
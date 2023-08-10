package company.dsa;

public class OrderAgnosticBS
{
    public static void main(String[] args)
    {
        int[] arr ={3,7,9,12,19,24,28,32,38,40,43,62,89,99};
        int tg=2;
        System.out.println(agnosticBs(arr, tg));
    }

    static int agnosticBs(int[] arr, int tg)
    {
        int start=0;
        int end=arr.length-1;
//        System.out.println(end);
        if(arr.length==0)
        {
            return -1;
        }
        if (arr[start]>arr[end])
        {
            while(arr[start]>=arr[end])
            {
                int mid=start+(end-start)/2;
                if(arr[mid]==tg)
                {
                    return mid;
                }
                if(tg<arr[mid])
                {
                    start=mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        if (arr[start]<arr[end])
        {
            while(arr[start]<=arr[end])
            {
                int mid=start+(end-start)/2;
                if (arr[mid] == tg) {
                    return mid;
                }
                if (tg < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

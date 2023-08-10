package company.dsa.recurssion;

public class RotatoryBinSear {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
                        //
        System.out.println(search(arr,7,0, arr.length-1));
    }
    static int search(int[] arr, int tg,int start, int end) {

        if (start > arr.length) {
            return -1;
        }
        int mid=start+ (end-start)/2;
        if(arr[mid]==tg)
        {
            return mid;
        }

        if(arr[start]<arr[mid] )
        {
            if(tg>arr[start] && tg<arr[mid])
            {
                return search(arr,7,0,mid-1);
            }
            else {
                return search(arr, 7, mid + 1, end);
            }
        }
        if(tg>arr[mid] && tg<arr[end])
        {
            return search(arr, 7, mid + 1, end);
        }
        return search(arr,7,0,mid-1);
    }
}

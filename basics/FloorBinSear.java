package company.dsa.basics;
public class FloorBinSear {
    public static void main(String[] args) {
        int[] arr={12,15,19,26,39,43,47,49,50,60,70,80};
        int tg=88;
        System.out.println(floorSearch(arr,tg));
    }
    // returns the smallest number which is lesser than or equal to target
    static int floorSearch(int[]arr,int tg)
    {
        // returns the smallest number if the target number is lesser then smallest number in array
        if(tg<=arr[0])
        {
            return -1;
        }
        //returns the greatest number if the target number is greater then greatest number in the array
        if(tg>=arr[arr.length-1])
        {
            return tg;
        }
        if(arr.length==0)
        {
            return -1;
        }
        int start=0;
        int end=arr.length;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==tg)
            {
                return -1;
            }
            else if(arr[mid]<tg)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return end;
    }
}
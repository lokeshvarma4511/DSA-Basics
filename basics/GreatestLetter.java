package company.dsa.basics;
public class GreatestLetter
{
    public static void main(String[] args) {
        char[] arr={'a','e','j','p','u','y'};
        char tg='p';
        System.out.println(greatBinSear(arr,tg));
    }
    static char greatBinSear(char[] arr, char tg)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
             if (tg>arr[mid])
             {
                 start=mid+1;
             }
             else
             {
                 end=mid-1;
             }
        }
        return arr[start % arr.length];
    }
}
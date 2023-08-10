package company.dsa.recurssion;

public class RecBinSearch {
    public static void main(String[] args) {
        int[] arr={12,18,28,30,33,48,50,68,73};
        int target=7;
        System.out.println(binSearch(arr,target,0,arr.length-1));
    }
    static int binSearch(int[] arr,int target,int s,int e)
    {
        int mid=s+(e-s)/2;
        if(s>e)
        {
            return -1;
        }
        else if(arr[mid]>target)
        {
            return binSearch(arr,target,mid+1,e);
        }
        else if(arr[mid]<target)
        {
            return binSearch(arr,target,s+1,e);
        }
        else
        {
            return mid;
        }
    }
}

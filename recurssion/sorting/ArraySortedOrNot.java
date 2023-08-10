package company.dsa.recurssion.sorting;
public class ArraySortedOrNot
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n=0;
        System.out.println(sortedOrNotRecurssion(arr,n));
    }
    public static boolean sortedOrNot(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]) continue;
            else return false;
        }
        return true;
    }
    // using recurssion
    public static boolean sortedOrNotRecurssion(int[] arr, int n) {
        if(n==arr.length)
        return true;
        return (arr[n] < arr[n + 1])  && sortedOrNotRecurssion(arr, n + 1);
    }

}

package company.dsa.recurssion;

import java.util.ArrayList;

public class SearchingElement {
    public static void main(String[] args) {
        int[] arr2={1,23,552,23};
        int tg=23;
        int n=0;
//        ArrayList<Integer> arr2=new ArrayList<>();
        System.out.println(searchElementInSideArrayList(arr2, tg,n));
        System.out.println(arr1);
    }
    public static boolean searchRec(int[] arr, int tg, int n)
    {
        if(n==arr.length)
        {
            return false;
        }
        return arr[n]==tg || searchRec(arr,tg,n+1);
    }
    public static int searchRecIndex(int[] arr, int tg, int n)
    {
        if(n==arr.length)
        {
            return -1;
        }
        if(arr[n]==tg)
        {
            return n;
        }
        return searchRecIndex(arr,tg,n+1);
    }
    static ArrayList<Integer> arr1=new ArrayList<>();
    static void searchRecIndexes(int[] arr2, int tg, int n)
    {
        if(n==arr2.length)
        {
            return;
        }
        if(arr2[n]==tg)
        {
            arr1.add(n);

        }
        searchRecIndexes(arr2,tg,n+1);
    }

    // OR RETURN THE LIST

    static ArrayList searchRecIndexesArray(int[] arr1, int tg, int n, ArrayList<Integer> arr2)
    {
        if(n==arr1.length)
        {
            return arr2;
        }
        if(arr1[n]==tg)
        {
        arr2.add(n);
    }
        return searchRecIndexesArray(arr1,tg,n+1,arr2);
    }
//    {1,56,1,}; tg=1
    static ArrayList<Integer> searchElementInSideArrayList(int[] arr1, int tg , int n)
    {
        ArrayList<Integer> arr2 = new ArrayList<>();
        if(n==arr1.length)
        {
            return arr2;
        }
        if(arr1[n]==tg)
        {
            arr2.add(n);
        }
        ArrayList<Integer>  arr3 = searchElementInSideArrayList(arr1,tg,n+1);
        arr2.addAll(arr3);
        return arr2;    }}
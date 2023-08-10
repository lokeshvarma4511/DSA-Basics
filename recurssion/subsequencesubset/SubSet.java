package company.dsa.recurssion.subsequencesubset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subSetDuplicate(arr));
//        List<List<Integer>> ar2 = subset(arr);
//        for (List<Integer> a : ar2) {
//            System.out.println(a);
//        }
    }
    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int k:arr)
        {
            int n = outer.size();
            for (int i = 0; i < n; i++)
            {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(k);
                outer.add(inner);
            } }
        return outer;
    }

    //Duplicates
    static List<List<Integer>> subSetDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) {
                start = end + 1;
            }
            end=outer.size()-1;
            int n = outer.size();
            for (int j= start;j < n; j++)
            {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }}
        return outer;
    }}
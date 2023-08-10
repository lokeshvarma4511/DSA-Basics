package company.dsa.recurssion.subsequencesubset;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args)
    {
        System.out.println(permutationsReturn("","abc"));
    }
    static void permutations(String p, String up)
    {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }
    // storing p in list
    static ArrayList<String > permutationsReturn(String p, String up)
    {
        ArrayList<String> outer = new ArrayList<>();
        if (up.isEmpty()) {
            ArrayList<String> inner =  new ArrayList<>();
            inner.add(p);
            return inner;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ArrayList<String> ar1 = permutationsReturn(f+ch+s,up.substring(1));
            outer.addAll(ar1);
        }
        return outer;
    }
}
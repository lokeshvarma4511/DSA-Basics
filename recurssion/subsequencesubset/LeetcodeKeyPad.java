package company.dsa.recurssion.subsequencesubset;

import java.util.ArrayList;

public class LeetcodeKeyPad {
    public static void main(String[] args) {
        System.out.println(pad("", "12"));
    }
    static ArrayList<String> pad(String p, String up)
    {
        ArrayList<String> ar1 = new ArrayList<>();
        if (up.isEmpty()) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }
        int digit= up.charAt(0) - '0';
        for (int i = (digit-1)*3; i <digit*3; i++)
        {
            char ch = (char)('a'+i);
            ar1.addAll(pad(p+ch,up.substring(1)));
        }
        return ar1;
    }
}

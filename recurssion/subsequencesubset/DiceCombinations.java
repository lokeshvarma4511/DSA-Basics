package company.dsa.recurssion.subsequencesubset;

import java.util.ArrayList;

public class DiceCombinations {
    public static void main(String[] args) {
//        dice("",4);
        System.out.println(diceRet("",4));
    }

    static void dice(String p, int up) {
        if (up == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <7 &&i<=up; i++) {
            dice(p+i,up-i);
        }
    }

    // dice returning arraylist
    static ArrayList<String> diceRet(String p, int up) {
        ArrayList<String> list = new ArrayList<>();
        if (up == 0) {
            ArrayList<String> ar1 = new ArrayList<>();
            ar1.add(p);
            return ar1;
        }
        for (int i = 1; i <7 &&i<=up; i++) {
            list.addAll(diceRet(p+i,up-i));
        }
        return list;
    }
}

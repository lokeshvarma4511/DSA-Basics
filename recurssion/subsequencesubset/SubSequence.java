package company.dsa.recurssion.subsequencesubset;
import java.util.ArrayList;
public class SubSequence {
    public static void main(String[] args) {
        subSeqAscii("","abc");
    }
    private static void subSeq(String p,String st) {
        if (st.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = st.charAt(0);
        subSeq(p+ch,st.substring(1));
        subSeq(p,st.substring(1));
    }
    // creating list inside the function and returning
    private static ArrayList<String> subSeqR(String p, String st) {
        if (st.isEmpty()) {
            ArrayList<String> ar1 = new ArrayList<>();
            ar1.add(p);
            return ar1;
        }
        char ch = st.charAt(0);
        ArrayList<String> l= subSeqR(p+ch,st.substring(1));
        ArrayList<String> r= subSeqR(p,st.substring(1));
        l.addAll(r);
        return l;
    }
    private static void subSeqAscii(String p,String st) {
        if (st.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = st.charAt(0);
        subSeqAscii(p+ch,st.substring(1));
        subSeqAscii(p,st.substring(1));
        subSeqAscii(p +(ch+0),st.substring(1));
    }
}
package company.dsa.basics;

public class StrindtoInt {
    public static void main(String[] args) {
        String a = "19";

        int no = Integer.parseInt(a);
        System.out.println(no);
        System.out.println(((Object) no).getClass().getSimpleName());

        }
}

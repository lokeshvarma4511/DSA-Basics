package company.dsa.JavaBasics;

public class BitwiseOddOrEven {
    public static void main(String[] args) {
        int n=4;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n) {
        if((n&1)==0)
        {
            return false;
        }
        return true;
    }
}
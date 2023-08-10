package company.dsa.JavaBasics;
public class ResetithBit {
    public static void main(String[] args) {
        int n = 11;
        int i = 3;
        System.out.println(resetBit(i, n));
    }
    private static int resetBit(int i, int n) {
        int mask = ~(1 << (i - 1));

        n = n & mask;
        return n;
    }
}
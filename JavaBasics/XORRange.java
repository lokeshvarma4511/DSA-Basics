package company.dsa.JavaBasics;

public class XORRange
{
    public static void main(String[] args) {
        int a=3;

        int b=9 ;
        // Range between a and b
        int ans = rangeXOR(a) ^ rangeXOR(b);
        System.out.println(ans);
    }
    private static int rangeXOR(int n) {
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n+1;
        }
        return 0;
    }
}
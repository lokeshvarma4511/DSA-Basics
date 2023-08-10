package company.dsa.JavaBasics;

public class MagicNumbers
{
    public static void main(String[] args) {
        int n=3;
        System.out.println(magicNumber(n));
    }

    private static int magicNumber(int n) {
        int ans = 0;
        int b = 5;
        while (n > 0) {
            int an= n&1;
            ans += an*b;
            n=n>>1;
            b=b*5;
        }
        return ans;
    }
}
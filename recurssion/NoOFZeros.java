package company.dsa.recurssion;

public class NoOFZeros {
    public static void main(String[] args) {
        int n=204;
        zeroCount(n);
        System.out.println(count);

    }
    static int count=0;
    static void zeroCount(int n) {
        if(n%10 != n)
        {
            if(n%10 == 0)
            {
                count += 1;
                n=n/10;
                zeroCount(n);
            }
                n = n / 10;
                zeroCount(n);

        }
    }
}

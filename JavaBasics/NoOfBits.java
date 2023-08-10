package company.dsa.JavaBasics;

public class NoOfBits
{
    public static void main(String[] args) {
        int n=16;
        int b=2;
        System.out.println(noOfDigits(n, b));
    }
    private static int noOfDigits(int n, int b) {
        int ans = (int)(Math.log(n)/ Math.log(b));
        return ans+1;
    }
}
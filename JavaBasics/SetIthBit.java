package company.dsa.JavaBasics;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i=1;
        System.out.println(setBit(n,i));
    }
    private static int setBit(int n, int i) {
        int temp = 1 << (i - 1);

        n= n | temp;
        return n;
    }
}
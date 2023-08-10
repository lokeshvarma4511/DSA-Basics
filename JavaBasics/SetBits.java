package company.dsa.JavaBasics;

public class SetBits {
    public static void main(String[] args) {
        System.out.println(setBits(7));
    }
        private static int setBits(int n)
        {
            int count = 0;
//            while (n > 0) {
//                count++;
//                n -= (n & -n);
//            }
            while (n > 0) {
                count++;
                n = (n & (n-1));
            }
            return count;
        }
    }
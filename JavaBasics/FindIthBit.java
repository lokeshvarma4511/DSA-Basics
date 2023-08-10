package company.dsa.JavaBasics;
public class FindIthBit
{
    public static void main(String[] args) {
        int i=4;
        int n=12;
        System.out.println(ithBit( n,  i));
    }
    private static int ithBit(int n , int i)
    {
        i=i-1;
        int bit= n&(1 <<(i));
        return bit;
    }
}
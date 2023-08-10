package company.dsa.basics;
public class LengthOfInteger {
    public static void main(String[] args) {
        int n=-456;
        System.out.println(len(n));
    }
    public static int len(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int count=0;
        while(n%10 != 0)
        {
            count +=1;
            n=n/10;
        }
        return count;
    }
}
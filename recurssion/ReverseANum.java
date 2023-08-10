package company.dsa.recurssion;

public class ReverseANum
{
    public static void main(String[] args)
    {
        int n=2302;
        revers(n);
        System.out.println(sum);
//        System.out.println("k:"+k);
    }
//    static void rev(int n)
//    {
//        if(n/10 == n)
//        {
//            System.out.println(n);
//            return;
//        }
//        System.out.print(n%10);
//        rev(n/10);
//    }
//    static int rev;
//    static float k=1;
//    static float res=0;
//    static float revers(int n)
//    {
//        if(n%10==n)
//        {
//            k=k*10;
//            return n* (1/k);
//        }
//        else {
//            k=k*10;
//            res=res+ (float) (n % 10)* (1/ k) + revers(n / 10) ;
////            System.out.println("res:"+res);
//            return res;
//        }
//    }
    static int sum=0;
    static void revers(int n)
    {
        if(n == 0)
        {
            return;
        }
        int rem= n%10;
        sum=sum*10 +rem;
        revers(n/10);
    }
}
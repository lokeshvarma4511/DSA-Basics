package company.dsa.recurssion;
public class Fibnonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21
        int n=50;
        System.out.println(fib(n));
    }
    static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
        else
//        {
            return fib(n-1) + fib(n-2);
//        }
    }
}
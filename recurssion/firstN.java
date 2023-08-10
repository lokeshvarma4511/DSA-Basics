package company.dsa.recurssion;

public class firstN {
    public static void main(String[] args) {
        byte n=5;
        rec(n);
    }
    static void rec(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            System.out.println(n);
            rec(n-1);
            System.out.println(" ");
        }
    }
}
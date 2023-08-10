package company.dsa.recurssion;

public class PrintNumsFEcur
{
    public static void main(String[] args)
    {
        func(5);

        print(1,5);
    }

    //CONCEPT
    static void func(int n)
    {
        if (n==0)
        {
            return ;
        }
        System.out.println(n);
        func(--n);   //n--
    }


    int i=0;
    static void print(int i,int n) {
        if(i<=n)
        {
            System.out.println(i);
            print(i+=1, n);
        }
        else
        {

        }


    }
}

package company.dsa.basics;

public class PrintingPatterns
{
    public static void main(String[] a)
    {
        int n=5;
        pattern7(n);
    }
    static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for (int i = 0; i < 2 * n; i++) {

            int c = i > n ? 2 * n - i : i;
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();

//            if (i > n) {
//                for (int k = 2*n-i; k > 0; k--) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            } else {
//                for (int j = 0; j < i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
            }
    }
    static void pattern6(int n)
    {
            for(int i=0;i<2*n;i++)
            {
                //for spaces
                int spaces=i>n ? i-n :n-i;
                for(int k=0;k<spaces;k++)
                {
                    System.out.print(" ");
                }
                // for stars
                int c=i>n ?2*n-i :i;
                for(int j=0;j<c;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++)
        {
            //spaces
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
//            first series
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
//            second series
            for(int j=2;j<=i;j++ )
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
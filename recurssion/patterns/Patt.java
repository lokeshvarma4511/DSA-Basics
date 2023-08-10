package company.dsa.recurssion.patterns;

public class Patt
{
    public static void main(String[] args)
    {
        p2(4,0);
    }

    //          Inverted Trianglw
    static void p1(int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if(r>c)
        {
            System.out.print("*");
            p1(r,c+1);
        }
        else
        {
            System.out.println();
            p1(r-1,0);
        }
    }
    //       Normal Triangle
    static void p2(int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if(r>c)
        {
            p2(r,c+1);
            System.out.print("*");
        }
        else
        {
            p2(r-1,0);
            System.out.println();
        }
    }
}
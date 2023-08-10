package company.dsa.basics;
import java.util.Arrays;
import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
//
////        int [] x = {1,2,3,4,5};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of Array Elements ");
//        int   n = sc.nextInt();
//        int [] x =new int[n];
//
//        System.out.println("Enter Elements");
//        for(int i = 0;i<n;i++)
//        {
//            x[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(x));
//        System.out.println(lsearch(x,2));;
//
//    }
//
//    static int lsearch(int[]x,int tg)
//    {
//        if(x.length<=0)
//        {
//            return -1;
//        }
//        for(int i = 0;i<=x.length;i++)
//
//        {
//            if(x[i]==tg)
//            {
////                return i
//                return i+1;
//            }
//        }
//        return -1;
//    }
//
//}

        int x[]  ={2,4,6,8,10};
        System.out.println(lsearch(x,2));
    }
    static int lsearch(int[]x,int tg)

    {
        if(x.length<=0)
        {
            return -1;
        }
        for(int i =0;i<x.length;i++)
        {
            if(x[i]==tg)
            {
                return i+1;
            }
        }
    return -1;
    }
}


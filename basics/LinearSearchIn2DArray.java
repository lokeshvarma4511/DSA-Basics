package company.dsa.basics;
import java.util.Arrays;

public class LinearSearchIn2DArray
{
//    public static void main(String[] args) {
//        int[][]arr=
//                {
//                {124,23,42,3},
//                {45,25,3},
//                {83,1,4}
//                };
//        int tg= 3;
//        int[] b=search(arr,tg);
//        System.out.println("found "+Arrays.toString(b));
//    }
//    static int[] search(int[][] a, int x)
//    {
//        int[] arr={};
//        if(a.length<=0)
//        {
//            return new int[]{-1,-1};
//        }
//        for(int i=0;i<a.length;i++)
//        {
////            int index=-1;
//            for(int j=0;j<a[i].length;j++)
//            {
//                if(a[i][j]==x)
//                {
//                    return new int[]{i,j};
//                }
//            }
//        }
//
//        return new int[]{-1,-1};
//    }



    public static void main(String[] args)
    {
        int[][]arr= {
                {24,23,42,3},
                {45,25,3},
                {83,1,4}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr)
    {
        int maxV=Integer.MIN_VALUE;

        if (arr.length<=0)
        {
            return maxV;
        }
        for(int[] i:arr)
        {
            for(int j:i)
            {
                if(j>maxV)
                {
                    maxV=j;
                }
            }
        }
        return maxV;
    }
}

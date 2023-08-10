package company.dsa.basics;

import java.util.Arrays;

public class BinSearchIn2D
{

    public static void main(String[] args)
    {
        int[][] arr ={
                {10,20,30,40},
                {15,25,35,45},
                {28,38,48,58},
                {29,39,49,59}

        };
        int tg=79;

        System.out.println(Arrays.toString(binSearch2D(arr,tg)));
    }
    //function
    static int[] binSearch2D(int[][]mat,int tg)
    {
        //starts from initial row
        int r=0;
        //starting from last column
        int c=mat.length-1;
        /*
        while checking for complex int
        the row should not increase than length-1
        the column not decrease than 0
         */
        while(r<=mat.length-1 && c>=0)
        {
            if(mat[r][c]==tg)
            {
                return new int[]{r,c};
            }
            //matrix ele is less than tg == should increase the row
            else if(mat[r][c]<tg)
            {
                r++;
            }
            // mat ele is greater than tg == column should decrease
            else
            {
                c--;
            }
        }
        //returns - if element's not present
        return new int[]{-1,-1};
    }
}

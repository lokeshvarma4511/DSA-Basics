package company.dsa.backtracking;

public class Sudoku {
    public static void main(String[] args)
    {
        int[][]board =new int[][]{
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
    };
//        System.out.println(solve(board));
        if(solve(board))
        {
            display(board);
        }
    }
    static boolean solve(int[][] board) {
        int row=-1;
        int col=-1;

        boolean emptyLeft =true;
        for (int i = 0;  i< board.length;  i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]==0)
                {
                    row=i;
                    col=j;
                    emptyLeft =false;
                    break;
                }
            }
            if (emptyLeft == false) {
                break;
            }
        }
        if (emptyLeft == true) {
            return true;
            //sudoku is solved
        }
        //filling if empty
        for (int num = 1; num <=9 ; num++) {
            if (isSafe(board,row,col,num))
            {
                board[row][col]=num;

                if(solve(board))
                {
//                    display(board);
//                    System.out.println();
                    return true;
                }
                //backtracking
                else
                {
                    board[row][col]=0;
                }
            }
        }
        //sudoku cannot be solved
        return false;
    }
    static void display(int[][] board)
    {
        for(int[] row:board)
        {
            for (int el : row) {
                System.out.print(el+"  ");
            }
            System.out.println();
        }

    }

    //checking if the element is safe or not
    static boolean isSafe(int[][] board, int row, int col, int number) {
        // checking box
        int sqrt =(int) Math.sqrt(board.length);
        int rowstart = row-(row%sqrt);
        int colstart = col - (col%sqrt);

        for (int i = rowstart; i <= rowstart+2; i++) {
            for (int j = colstart; j <= colstart+2 ; j++) {
                if (board[i][j]==number)
                {
                    return false;
                }
            }
        }
        //for checking entire row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]==number)
            {
                return false;
            }
        }
        //for checking entire col
        for (int i = 0; i < board.length; i++)
        {
            if (board[i][col]==number)
            {
                return false;
            }
        }
        return true;
    }
}
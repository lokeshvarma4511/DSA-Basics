package company.dsa.backtracking;

public class Knight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board= new boolean[n][n];

        knights(board,0,0,n);
    }
    static void knights(boolean[][] board, int row, int col, int k )
    {
        if(k==0)
        {
            display(board);
            System.out.println();
            return ;
        }
        //end of board
        if( row==board.length-1 && col == board.length   )
        {
            return;
        }
        //for shfting row
        if( col == board.length )
        {
            knights(board,row+1,0,k);
            return;
        }
        if (isSafe(board,row,col))
        {
            board[row][col] =true;
            knights(board,row,col+1,k-1);
            board[row][col]=false;
        }
        knights(board,row,col+1,k);
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        //isValid is for checking board[r][c] are  out of board or not
        if (isValid(board,row-2,col+1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board,row-2,col-1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board,row-1,col+2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }if (isValid(board,row-1,col-2)) {
            if (board[row - 1][col -2]) {
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board, int row, int col) {

        if (row< board.length && row>=0 && col< board.length && col>=0)
        {
            return true;
        }
        else {
            return false;
        }
    }
    private static void display(boolean[][] board) {
        for(boolean[] row:board)
        {
            for(boolean element : row)
            {
                if(element)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
package company.dsa.advancedconcepts.linkedlist.leetcode;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board= new char[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                board[i][j]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver)
        {
            display(board);
            System.out.println("Player"+ player+ " enter:");
            int row= sc.nextInt();
            int col= sc.nextInt();
            if (board[row][col]==' ')
            {
                board[row][col]=player;
                gameOver = haveWon(board, player);
                if (gameOver)
                {
                    System.out.println("Player "+ player+ " has won!");
                    return;
                }
                else
                {
                    player = (player=='X')? 'O': 'X';
                }
            }
            else {
                System.out.println("Invalid Move!. Try again");
            }
        }
        display(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        // checking rows
        for (int i = 0; i <3; i++) {
            if (board[i][0]==player&&board[i][1]==player&&board[i][2]==player) {
                return true;
            }
        }
        // Checking cols
        for (int i = 0; i <3; i++) {
            if (board[0][i]==player&&board[1][i]==player&&board[2][i]==player)
            {
                return true;
            }
        }
        //checking left-to-right diagonal
            if (board[0][0]==player&&board[1][1]==player&&board[2][2]==player)
            {
                return true;
            }
        // checking for right-to-left diagonal
        if (board[0][2]==player&&board[1][1]==player&&board[2][0]==player)
        {
            return true;
        }
        return false;
    }

    private static void display(char[][] board) {
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (j==0)
                {
                    System.out.print("|");
                }
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
}
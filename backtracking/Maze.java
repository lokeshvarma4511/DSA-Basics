package company.dsa.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazePathRetDiagonal("",3,3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazePathRetRiver("",maze,0,0);
//        mazePathRetDiagonalRiver("",maze,0,0);

    }
    //returns the number of paths
    static int maze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = maze(r - 1, c);
        int right = maze(r, c - 1);
        int count = left + right;
        return count;
    }
    // printing paths
    static void mazePath(String p, int c, int r) {
        if(c==1 && r==1)
        {
            System.out.println(p);
            return;
        }
        if (c > 1)


        {
            mazePath(p+"R",c-1,r);
        }
        if (r > 1) {
            mazePath(p+"D",c,r-1);
        }
    }
    //       Returning List
    static ArrayList<String> mazePathRet(String p, int c, int r)
    {
        ArrayList<String> list1 = new ArrayList<>();
        if(c==1 && r==1)
        {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }
        if (c > 1)
        {
            list1.addAll(mazePathRet(p+'R',c-1,r));
        }
        if (r > 1) {
            list1.addAll(mazePathRet(p+'D',c,r-1));
        }
        return list1;
    }
    //constraints are we can move along left, right including diagonal
    static ArrayList<String> mazePathRetDiagonal(String p, int c, int r)
    {
        ArrayList<String> list1 = new ArrayList<>();
        if(c==1 && r==1)
        {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }
        if (c > 1)
        {
            list1.addAll(mazePathRetDiagonal(p+'R',c-1,r));
        }
        if (r > 1) {
            list1.addAll(mazePathRetDiagonal(p+'D',c,r-1));
        }
        if (c > 1 && r > 1) {
            list1.addAll(mazePathRetDiagonal(p + 'O', c - 1, r - 1));
        }
        return list1;
    }
    // River is a condition on the specified  location
    static ArrayList<String> mazePathRetDiagonalRiver(String p, boolean[][] maze, int r, int c)
    {
        ArrayList<String> list1 = new ArrayList<>();
        if(c==maze[0].length-1 && r==maze.length-1 )
        {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }
        if(!maze[r][c])
        {
            return list1;
        }
        if (c <maze[0].length-1)
        {
            list1.addAll(mazePathRetDiagonalRiver(p+'R',maze,r,c+1));
        }
        if (r<maze.length-1)
        {
            list1.addAll(mazePathRetDiagonalRiver(p+'D',maze,r+1,c));
        }
        return list1;
    }
    static void mazePathRetRiver(String p, boolean[][] maze, int r, int c)
    {
        if(c==maze[0].length-1 && r==maze.length-1 )
        {
            System.out.println(p);
            return;
        }
        if(maze[r][c]=false)
        {
            return ;
        }
        if (r<maze.length-1)
    {
        mazePathRetRiver(p+'D',maze,r+1,c);
    }
        if (c <maze[0].length-1)
        {
            mazePathRetRiver(p+'R',maze,r,c+1);
        }
    }
}
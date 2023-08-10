package company.dsa.backtracking;

import java.util.Arrays;

public class MazeAllDir {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
//        int step =1;
//        allDir("",maze,0,0);
        allDirPath("",maze,0,0,1,path);


    }
    static void allDir(String p, boolean[][] maze, int r, int c)
    {
        if(c==maze[0].length-1 && r==maze.length-1 )
        {
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false)
        {
            return ;
        }
        // makes every element false which are included, to don't consider it again in this path
        maze[r][c] = false;
        if (r<maze.length-1)
        {
            allDir(p+'D',maze,r+1,c);
        }
        if (c <maze[0].length-1)
        {
            allDir(p+'R',maze,r,c+1);
        }
        //Left
        if (c >0 )
        {
            allDir(p+'L',maze,r,c-1);
        }
        // Top
        if (r>0 )
        {
            allDir(p+'U',maze,r-1,c);
        }
        // makes every element true which are included, so other paths can include in them (removing all the changes done by this function
        maze[r][c] = true;
    }


    static void allDirPath(String p, boolean[][] maze, int r, int c,int step,int[][] path)
    {
        if(c==maze[0].length-1 && r==maze.length-1 )
        {
            path[r][c] = step;
            for(int[] arr :path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false)
        {
            return ;
        }
        // makes every element false which are included, to don't consider it again in this path
        maze[r][c] = false;
        path[r][c] =step;

        if (r<maze.length-1)
        {
            allDirPath(p+'D',maze,r+1,c,step+1,path);
        }
        if (c <maze[0].length-1)
        {
            allDirPath(p+'R',maze,r,c+1,step+1,path);
        }
        //Left
        if (c >0 )
        {
            allDirPath(p+'L',maze,r,c-1,step+1,path);
        }
        // Top
        if (r>0 )
        {
            allDirPath(p+'U',maze,r-1,c,step+1,path);
        }
        // makes every element true which are included, so other paths can include in them (removing all the changes done by this function
        maze[r][c] = true;
        path[r][c]=0;
    }
}
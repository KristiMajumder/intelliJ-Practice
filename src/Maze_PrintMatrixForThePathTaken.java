import java.util.*;
//return the total no of ways to reach the end.print the path and the matrix.
public class Maze_PrintMatrixForThePathTaken {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] maze=new int[board.length][board[0].length];
        int count=findPaths("",board,maze,0,0,1);
        System.out.println(count);
    }
    //can move up down right and left
    public static int findPaths(String p,boolean[][] board,
                                 int[][] maze, int row,
                                 int col,
                                 int steps){

        int count=0;
        if(row==maze.length-1 &&col==maze[0].length-1){
            System.out.println(p);
            maze[row][col]=steps;
            for(int[] arr:maze){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return 1;
        }

       if(!board[row][col]){
           return 0;
       }

       board[row][col]=false;
       maze[row][col]=steps;

       if(row<maze.length-1){
           count+=findPaths(p+'D',board,maze,row+1,col,steps+1);

       }
       if(row>0){
           count+=findPaths(p+'U',board,maze,row-1,col,steps+1);

       }
       if(col<maze[0].length-1){
           count+=findPaths(p+'R',board,maze,row,col+1,steps+1);

       }
       if(col>0){
           count+=findPaths(p+'L',board,maze,row,col-1,steps+1);

       }

       board[row][col]=true;
        maze[row][col]=steps;
        return count;
    }

}

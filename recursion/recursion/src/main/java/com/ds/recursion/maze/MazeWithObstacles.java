package com.ds.recursion.maze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MazeWithObstacles {

  public static void main(String[] args) {

    int[][] maze1={{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};

    int[][] maze={{1, 1},{0,1}};
//     ArrayList<String> result = ratInMaze(maze);
//
//     result.stream().forEach(System.out::println);

    // allPathPrint()
    int n=maze.length;
    int m=maze[0].length;

    int[][] vis=new int[n][m];
    int[][] path=new int[n][m];

    allPathPrint(maze,vis,"",0, 0, n, m,path,1);
  }

  public static ArrayList<String> ratInMaze(int[][] maze) {

    /*
      Without visited array it causes infinite loop up and down like that its never reach base
      condition and also it never ends recursion call. ultimately it will cause stack overflow
      error
     */
    int n=maze.length;
    int m=maze[0].length;

    int[][] vis=new int[n][m];

   // vis[0][0]=1;
    return ratInMaze(maze,vis,"",0,0,n,m);
  }

  public static ArrayList<String> ratInMaze(int[][] maze,int[][] vis,String processed,int row,int col,
                                     int n,
                                     int m) {

    if(row==n-1 && col==m-1)
    {
      ArrayList<String> result = new ArrayList<>();
      //System.out.println(processed);
      result.add(processed);
      return result;
    }

    ArrayList<String> result = new ArrayList<>();

    char[] chars={'D','L','R','U'};
    int[][] arr={{1,0},{0,-1},{0,1},{-1,0}};

    for(int i=0;i<4;i++)
    {

      int a=arr[i][0],b=arr[i][1];
      char c=chars[i];

      int r=row+a;

      int co=col+b;

      if( r>=0 && r <n && co>=0 && co<m && vis[r][co]==0 && maze[r][co]==1)
      {

        vis[row][col]=1;
        List<String> subSetResult= ratInMaze(maze,vis,processed+c,row+a,col+b,n,m);
        // This line is where the function will be over
        // so before function gets remove the changes that were made by that function
        result.addAll(subSetResult);
        vis[row][col]=0;
      }

    }


    return result;
  }


  public static void allPathPrint(int[][] maze,int[][] vis,String processed,int row,
                                           int col, int n, int m,int[][] path,int step) {

    /**
     *
     * Step was when you go back step will be what the step in that particular recursion call
     */

    if(row==n-1 && col==m-1)
    {

      path[row][col]=step;
      for(int[] p:path)
      {
        System.out.println(Arrays.toString(p));
      }

      System.out.println(processed);
      return ;
    }

    char[] chars={'D','L','R','U'};
    int[][] arr={{1,0},{0,-1},{0,1},{-1,0}};

    for(int i=0;i<4;i++)
    {

      int a=arr[i][0],b=arr[i][1];
      char c=chars[i];

      int r=row+a;

      int co=col+b;

      if( r>=0 && r <n && co>=0 && co<m && vis[r][co]==0 && maze[r][co]==1)
      {

        vis[row][col]=1;
        path[row][col]=step;
        allPathPrint(maze,vis,processed+c,row+a,col+b,n,m,path,step+1);
        path[row][col]=0;
        vis[row][col]=0;
      }

    }

  }



}

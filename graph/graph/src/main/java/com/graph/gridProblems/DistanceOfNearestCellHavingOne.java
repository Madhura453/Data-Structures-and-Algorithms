package com.graph.gridProblems;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCellHavingOne {

    public int[][] nearest(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int[][] result=new int[n][m];

        Queue<Pair> queue=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    queue.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};


        while(!queue.isEmpty())
        {
            Pair pair=queue.poll();
            int row=pair.row;
            int col=pair.column;
            int distance=pair.distance;

            for(int i=0;i<4;i++)
            {
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==false )
                {
                    vis[nrow][ncol]=true;
                    result[nrow][ncol]=distance+1;
                    queue.add(new Pair(nrow,ncol,distance+1));
                }
            }
        }


        return result;
    }


    class Pair
    {
        int row;

        int column;

        int distance;

        public Pair(int row, int column,int distance)
        {
            this.row=row;
            this.column=column;
            this.distance=distance;
        }
    }
}


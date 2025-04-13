package com.graph.gridProblems;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public int orangesRotting(int[][] mat) {

        Queue<Pair> queue=new LinkedList<>();

        int n=mat.length;
        int m=mat[0].length;

        int freshCount=0;

        int[][] vis=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==2)
                {
                    queue.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else
                {
                    vis[i][j]=0;
                }

                if(mat[i][j]==1)
                {
                    freshCount++;
                }

            }
        }

        int count=0;

        int maxTime=0;

        int[] delRow={-1,0,1,0};
        int[] delCol={0,-1,0,1};

        while(!queue.isEmpty())
        {
            Pair pair=queue.poll();
            int row=pair.row;
            int col=pair.col;
            int time=pair.time;
            maxTime=Math.max(maxTime,time);
            for(int i=0;i<4;i++)
            {
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m
                        && vis[nrow][ncol]==0 && mat[nrow][ncol]==1)
                {
                    queue.add(new Pair(nrow,ncol,time+1));
                    vis[nrow][ncol]=2;
                    count++;
                }

            }
        }




        if(freshCount!=count)
        {
            return -1;
        }

        return maxTime;
    }

}

class Pair
{

    int row;

    int col;

    int time;

    public Pair(int row,int col,int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
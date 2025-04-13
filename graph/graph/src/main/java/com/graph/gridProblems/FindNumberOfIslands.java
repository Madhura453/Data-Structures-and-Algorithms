package com.graph.gridProblems;

import java.util.LinkedList;
import java.util.Queue;

public class FindNumberOfIslands {

    public int numIslands(char[][] grid) {
        // Code here

        int m=grid.length;

        int n=grid[0].length;

        int c=0;
        int[][] vis=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==0 && grid[i][j]=='1')
                {
                    c++;
                    bfs(i,j,vis,grid);
                }
            }
        }

        return c;
    }


    void bfs(int i,int j,int[][] vis,char[][] grid)
    {

        int m=grid.length;

        int n=grid[0].length;

        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(i,j));
        vis[i][j]=1;


        while(!q.isEmpty())
        {
            int f=q.peek().first;
            int s=q.peek().second;
            vis[f][s]=1;
            q.remove();
            for(int r=-1;r<=1;r++)
            {
                for(int c=-1;c<=1;c++)
                {
                    int a=f+r;
                    int b=s+c;

                    if(a>=0 && a<m && b>=0 && b<n && vis[a][b]==0 &&
                            grid[a][b]=='1')
                    {
                        vis[a][b]=1;
                        q.add(new Pair(a,b));
                    }
                }
            }
        }
    }

    class Pair
    {
        Integer first;

        Integer second;

        public Pair(Integer first,Integer second)
        {
            this.first=first;
            this.second=second;
        }
    }
}

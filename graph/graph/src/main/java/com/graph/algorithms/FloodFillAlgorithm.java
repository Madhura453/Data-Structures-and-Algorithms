package com.graph.algorithms;

public class FloodFillAlgorithm {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here
        int[][] ans=new int[image.length][image[0].length];

        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                ans[i][j]=image[i][j];

            }
        }
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        int iniColor=image[sr][sc];
        dfs(sr,sc,ans,image,newColor,delRow,delCol,iniColor);
        return ans;
    }

    public void dfs(int row,int col,int[][] ans,
                    int[][] image,int newColor,int[] delRow,int[] delCol,int iniColor)
    {
        int n=image.length;
        int m=image[0].length;
        ans[row][col]=newColor;
        for(int i=0;i<4;i++)
        {
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                    image[nrow][ncol]==iniColor && ans[nrow][ncol]!=newColor)
            {
                dfs(nrow,ncol,ans,image,newColor,delRow,delCol,iniColor);
            }

        }
    }
}

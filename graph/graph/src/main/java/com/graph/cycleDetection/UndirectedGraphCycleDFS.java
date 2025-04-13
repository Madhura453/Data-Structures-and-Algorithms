package com.graph.cycleDetection;

import java.util.ArrayList;

public class UndirectedGraphCycleDFS {

    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here

        int n=adj.size();

        int[] vis=new int[n];

        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                if(dfs(i,-1,vis,adj)==true)
                {
                    return true;
                }
            }
        }

        return false;
    }


    boolean dfs(int node,int parent,int[] vis,ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=1;

        for(int adjacentNode:adj.get(node))
        {
            if(vis[adjacentNode]==0)
            {
                if(dfs(adjacentNode,node,vis,adj)==true)
                {
                    return true;
                }
            }
            else if(adjacentNode!=parent)
            {
                return true;
            }

        }

        return false;

    }
}

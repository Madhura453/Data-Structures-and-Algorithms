package com.graph.dfs;

import java.util.ArrayList;

public class DfsTraversal {

    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here


        boolean[] vis=new boolean[v];
        ArrayList<Integer> dfs =new ArrayList<>();
        dfs(0,vis,adj,dfs);


        return dfs;


    }

    public void dfs(int node, boolean[] vis,
                    ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs)
    {
        vis[node]=true;
        dfs.add(node);

        for(Integer node1:adj.get(node))
        {
            if(!vis[node1])
            {
                dfs(node1,vis,adj,dfs);
            }

        }

    }
}

package com.graph.cycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphCycleBFS {

    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {

        int n=adj.size();

        boolean[] vis=new boolean[n];

        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                if(isCycle(i,adj,vis))
                {
                    return true;
                }
            }
        }


        return false;

    }

    boolean isCycle(int src,ArrayList<ArrayList<Integer>> adj,boolean[] vis)
    {

        vis[src]=true;

        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(src,-1));

        while(!q.isEmpty())
        {
            int node=q.peek().node;
            int parent=q.peek().parent;
            q.poll();

            for(int adjacentNode:adj.get(node))
            {
                if(vis[adjacentNode]==false)
                {
                    vis[adjacentNode]=true;
                    q.add(new Pair(adjacentNode,node));
                }
                else if(adjacentNode!=parent)
                {
                    return true;
                }
            }
        }

        return false;
    }

}


class Pair
{
    int node;

    int parent;

    public Pair(int node,int parent)
    {
        this.node=node;
        this.parent=parent;
    }
}
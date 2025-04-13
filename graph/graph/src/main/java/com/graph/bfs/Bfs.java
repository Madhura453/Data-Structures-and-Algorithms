package com.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs=new ArrayList<>();

        Queue<Integer> queue= new LinkedList<>();
        boolean[] visited=new boolean[v];

        queue.add(0);
        visited[0]=true;

        while (!queue.isEmpty())
        {
            int node=queue.poll();
            bfs.add(node);
            for (Integer it:adj.get(node))
            {
                if (!visited[it])
                {
                    queue.add(it);
                    visited[it]=true;
                }

            }
        }

        return bfs;
    }
}



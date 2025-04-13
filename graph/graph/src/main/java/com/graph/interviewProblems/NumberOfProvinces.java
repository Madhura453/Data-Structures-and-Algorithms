package com.graph.interviewProblems;

import java.util.ArrayList;

public class NumberOfProvinces {


//User function Template for Java


    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        // code here

        int count = 0;

        ArrayList<ArrayList<Integer>> adjLts = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjLts.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                int a = adj.get(i).get(j);

                // System.out.println(a);
                if (a == 1 && i != j) {

                    adjLts.get(i).add(j);
                    // adjLts.get(j).add(i);

                }
            }
        }


        //  for(int i=0;i<v;i++)
        // {
        //     System.out.println(adjLts.get(i));
        // }

        int[] vis = new int[v];

        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, adjLts, vis);
            }
        }


        return count;
    }

    static void dfs(int node, ArrayList<ArrayList<Integer>> adjLts, int[] vis) {

        vis[node] = 1;

        for (Integer it : adjLts.get(node)) {
            if (vis[it] == 0) {
                dfs(it, adjLts, vis);
            }

        }
    }


}

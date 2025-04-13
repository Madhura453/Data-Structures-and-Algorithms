package com.recursion.dynamic_programmming.rdp;

import java.util.HashMap;

public class AdvancedDP {

    public static void main(String[] args) {
       int c= frog(6,new int[]{30,10,60,10,60,50});
       //System.out.println(c);
//        int c1= frogMemoraztion(5,new HashMap<>(),new int[]{30,10,60,10,60,50});
 //       System.out.println(c1);
        int c2= frogSpaceOptimazation(5,new int[]{30,10,60,10,60,50});
        System.out.println(c2);
    }



    static int frogSpaceOptimazation(int n,int[] heights) {


        int previous = 0;
        int previous2 = 0;


        for (int i = 1; i < n; i++) {
            int  l = previous +
                    Math.abs(heights[i] - heights[i - 1]);
            int r=Integer.MAX_VALUE;
            if (i > 1) {
                r = previous2 + Math.abs(heights[i] -
                        heights[i - 2]);

            }

            int current=Math.min(l, r);
            previous2=previous;
            previous=current;
        }

        return previous;
    }

        static int frogMemoraztion(int n, HashMap<Integer,Integer> m,int[] heights)
    {

        if (n == 0) {
            return 0;
        }

        if(m.containsKey(n))
        {
            return m.get(n);
        }
        int l = frogMemoraztion(n - 1,m, heights) +
                Math.abs(heights[n] - heights[n - 1]);

        int r = Integer.MAX_VALUE;
        if (n > 1) {
            r = frogMemoraztion(n - 2,m, heights) + Math.abs(heights[n] -
                    heights[n - 2]);
        }
        int result=Math.min(l,r);
        m.put(n,result);
        return result;
    }


    static int frog(int n, int[] heights) {
        int[] dp = new int[n];

        dp[0] = 0;


        for (int i = 1; i < n; i++) {
            int  l = dp[i - 1] +
                    Math.abs(heights[i] - heights[i - 1]);
            int r=Integer.MAX_VALUE;
            if (i > 1) {
                r = dp[i - 2] + Math.abs(heights[i] -
                        heights[i - 2]);

            }

            dp[i]=Math.min(l, r);
        }

        return dp[n-1];
    }
}

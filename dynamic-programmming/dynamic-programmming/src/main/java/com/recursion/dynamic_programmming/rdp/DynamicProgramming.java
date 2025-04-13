package com.recursion.dynamic_programmming.rdp;

import java.util.HashMap;

public class DynamicProgramming {
    public static void main(String[] args)
    {
//        int f=nthFibonacciTabulaztion(0);
//        int f1=nthFibonacciTabulaztion(1);
//        int f2=nthFibonacciTabulaztion(5);

        // System.out.println(f+" "+f1+" "+f2);
//         HashMap<Integer,Integer> memo=new HashMap<>();
//        int fm= fibonacciMemoization(5,memo);
//        System.out.println(fm);
      //  System.out.println(directFibonacci(5));
      //  System.out.println(nthFibonacciTabulaztion(5));
        int c=climbStairs(0,5);
        System.out.println(c);
    }


   static int climbStairs(int n,int index)
    {
        if(n<=1)
        {
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }


        return dp[n];
    }

    public static int directFibonacci(int n)
    {
        int previous2=0;
        int previous=1;

        for(int i=2;i<=n;i++)
        {
            int current=previous2+previous;
            previous2=previous;
            previous=current;
        }
        return previous;
    }

    public static int nthFibonacciTabulaztion(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int[] fa=new int[n+1];
        fa[0]=0;
        fa[1]=1;
        for(int i=2;i<=n;i++)
        {
            fa[i]=fa[i-1]+fa[i-2];
        }
        return fa[n];
    }


    public static int fibonacciMemoization (int n,HashMap<Integer,Integer> memo)
    {
        if(n<=1)
        {
            return n;
        }

        if(memo.containsKey(n))
        {
            return memo.get(n);
        }

        int Last=fibonacciMemoization(n-1,memo);
        int secondLast=fibonacciMemoization(n-2,memo);
        memo.put(n,Last+secondLast);
        return Last+secondLast;
    }
}

package com.recursion.dynamic_programmming.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practice {

    public static void main(String[] args)
    {
        System.out.println(new Solution().maximizeCuts(11,5,3,2));
    }
}
class Solution {
    // Function to find the maximum number of cuts.

    public int maximizeCuts1(int n, int x, int y, int z) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {

            if((i>=x) && dp[i-x]!=Integer.MIN_VALUE)
            {
                dp[i]=Math.max(dp[i],dp[i-x]+1);
            }
            if((i>=y) && dp[i-y]!=Integer.MIN_VALUE)
            {
                dp[i]=Math.max(dp[i],dp[i-y]+1);
            }
            if((i>=z) && dp[i-z]!=Integer.MIN_VALUE)
            {
                dp[i]=Math.max(dp[i],dp[i-z]+1);
            }

        }
        return dp[n]<0?0:dp[n];

    }
    public int maximizeCuts(int n, int x, int y, int z) {
        int[] dp = new int[n + 1];

        // Initialize dp array with a very small value
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        // Base case: No segment can be obtained from length 0
        dp[0] = 0;

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            if (i >= x && dp[i - x] != Integer.MIN_VALUE) {
                dp[i] = Math.max(dp[i], dp[i - x] + 1);
            }
            if (i >= y && dp[i - y] != Integer.MIN_VALUE) {
                dp[i] = Math.max(dp[i], dp[i - y] + 1);
            }
            if (i >= z && dp[i - z] != Integer.MIN_VALUE) {
                dp[i] = Math.max(dp[i], dp[i - z] + 1);
            }
        }

        // If dp[n] is still Integer.MIN_VALUE, it means it's not possible to cut the segment into the required lengths
        return dp[n] < 0 ? 0 : dp[n];
    }
}

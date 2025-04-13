package com.ds.recursion.service.combinationSum;

public class CoinsExchangeProblem {
    public static void main(String[] args) {

    }
    public int count(int[] coins, int sum) {
        // code here.

        return coins(coins,sum,0,0);
    }

    public int coins(int[] coins, int sum, int index, int count)
    {
        if(index==coins.length && sum==0)
            {
                count++;
            }


        if(sum-coins[index]>=0)
        {
            coins(coins,sum-coins[index],index,count);

            sum=sum+coins[index];
        }

        coins(coins,sum-coins[index],index,count);
        return count;
    }
}

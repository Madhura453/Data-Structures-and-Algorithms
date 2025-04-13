package com.ds.recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class Recursion {


    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }

    public static void permute(int[] nums)
    {
        List<List<Integer>> result=new ArrayList<>();

        recurPermute(nums,new ArrayList<>(),result,new boolean[3]);

        System.out.println(result);
    }

    private static void recurPermute(int[] nums, List<Integer> ds,List<List<Integer>> result,
                                     boolean[] freq)
    {
        if(nums.length==ds.size())
        {
            result.add(new ArrayList<>(ds));
            return;
        }

        for (int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                recurPermute(nums,ds,result,freq);
                freq[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}

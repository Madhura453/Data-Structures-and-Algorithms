package com.ds.recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumOne {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        List<Integer> result = new ArrayList<>();
        boolean isSubsetSum = subsetSum(arr,0,0L,10L,result);
        System.out.println(result);
    }

    public static boolean subsetSum(int[] arr, int index, Long sum, long target,
                                            List<Integer> result)
    {
        System.out.println("Index: " + index + ", Sum: " + sum+" "+result);
        if(index>arr.length-1)
        {
            return sum == target;
        }

        result.add(arr[index]);
        if (subsetSum(arr,index+1,sum+arr[index],target,result))
        {
            return true;
        }
        result.remove(result.size()-1);
        return subsetSum(arr, index + 1, sum, target,result);
    }
}

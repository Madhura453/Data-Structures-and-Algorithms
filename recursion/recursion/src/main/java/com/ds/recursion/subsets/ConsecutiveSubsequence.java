package com.ds.recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveSubsequence {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        subSet(arr,0,result,new ArrayList<>());
        result.forEach(System.out::println);
    }

    public static List<List<Integer>> subSet(int[] arr,int index,List<List<Integer>> result,
                                            List<Integer> subArr)
    {
         if(index>arr.length-1)
         {
             result.add(new ArrayList<>(subArr));
             return result;
         }

         subArr.add(arr[index]);
         // It is index adding in original array
         subSet(arr,index+1,result,subArr);
         // Here we are removing element from sub array.
        // we are removing the current element we just added in previous step
         subArr.remove(Integer.valueOf(arr[index]));//subArr.remove(subArr.size()-1);
         subSet(arr,index+1,result,subArr);
         return result;
    }
}

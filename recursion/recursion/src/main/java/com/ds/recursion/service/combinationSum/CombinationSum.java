package com.ds.recursion.service.combinationSum;

import java.util.ArrayList;

public class CombinationSum {

    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

          comSum(0,target,arr,new ArrayList<>(),result);

          return result;
    }

    private static void comSum(int i,int target, int[] arr,ArrayList<Integer> list,
                               ArrayList<ArrayList<Integer>> result) {

        if(i>=arr.length)
        {
            if(target==0)
            {
                result.add(new ArrayList<>(list));
            }

            return;
        }

        list.add(arr[i]);

        comSum(0,target-arr[i],arr,new ArrayList<>(),result);

        list.remove(arr[i]);

        comSum(0,target,arr,new ArrayList<>(),result);
    }
}

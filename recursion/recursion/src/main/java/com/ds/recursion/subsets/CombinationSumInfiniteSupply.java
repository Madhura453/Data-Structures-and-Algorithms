package com.ds.recursion.subsets;

import java.util.ArrayList;

public class CombinationSumInfiniteSupply {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

       comSum(0,8,new int[]{2,3,6,7},new ArrayList<>(),result);


       result.stream().forEach(System.out::println);

    }


    private static void comSum(int i,int target, int[] arr,
                               ArrayList<Integer> list,
                               ArrayList<ArrayList<Integer>> result) {

        if(i==arr.length)
        {
            if(target==0)
            {
                result.add(new ArrayList<>(list));
            }

            return;
        }

        if(arr[i]<=target)
        {

            list.add(arr[i]);
            comSum(i,target-arr[i],arr,list,result);
            list.remove(Integer.valueOf(arr[i]));
        }

        comSum(i+1,target,arr,list,result);
    }

}

package com.ds.recursion.practice;

import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {

        int[] arr={1,2,4,5,7,8,9};
        //System.out.println(g);
    }

    public int perfectSum(int[] nums, int target) {

        return  countSubsetSum(nums,0,0L,target,new ArrayList<>());

    }

    public static int countSubsetSum(int[] arr, int index, Long sum, int target,
                                     ArrayList<Integer> a) {

        if (index > arr.length - 1) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        int count = 0;

        a.add(arr[index]);

        count += countSubsetSum(arr, index + 1, sum + arr[index], target,a);

        a.remove(a.size()-1);

        count += countSubsetSum(arr, index + 1, sum, target,a);

        return count;
    }

    public static int countSubsetSum(int[] arr, int index, Long sum, int target) {

        if (index > arr.length - 1 || (sum>=target)) {
            if (sum == target) {


                return 1;
            }
            return 0;
        }

        int count = 0;

        count += countSubsetSum(arr, index + 1, sum + arr[index], target);


        count += countSubsetSum(arr, index + 1, sum, target);

        return count;
    }


}

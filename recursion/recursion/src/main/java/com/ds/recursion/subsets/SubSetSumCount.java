package com.ds.recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSetSumCount {

    public static void main(String[] args) {

        int[] arr={1,2,3};

        int count = countSubsetSum(arr,0,0L,3);
        System.out.println(count);
    }

    // pattern to count subsequences
    /*
    base case
      satisfies return 1
      not satisfies return 0
      l=f();
      r=f();
      return l+r;
     */

    public static int countSubsetSum(int[] arr, int index, Long sum, long target) {
        if (index > arr.length - 1) {
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

    public static int countSubsetSum(int[] arr, int index, Long sum, int target) {

        /*
        sum>=target this condition strictly done if array contains
        positives only.
         */
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

package com.ds.recursion.service;

import java.util.ArrayList;
import java.util.List;

public class AdvancedRecursion {

    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 2};
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        //generateSubSequences(0, a, list, result);
        //
        // generateSubSequencesReverse(0,a,list,result);
//        System.out.println(result);

        int[] t = new int[]{1, 2, 1};
        int targetSum = 2;
        List<List<Integer>> targetResult = new ArrayList<>();
        //  targetSum(0,t,new ArrayList<>(),targetResult,targetSum,0);
        //  System.out.println(targetResult);

//        targetSumFirstSequence(0,t,new ArrayList<>(),targetResult,targetSum,0);
//        System.out.println(targetResult);
        int count = countTargetSumSubSequences(0, t, targetSum, 0);
        System.out.println(count);
    }

    public static int frogJump(int n, int heights[]) {

        return frog(n-1,heights);
    }

    static int frog(int n, int[] heights)
    {

        if (n == 0) {
            return 0;
        }
        int l = frog(n - 1, heights) +
                Math.abs(heights[n] - heights[n - 1]);

        int r = Integer.MAX_VALUE;
        if (n > 1) {
            r = frog(n - 2, heights) + Math.abs(heights[n] -
                    heights[n - 2]);
        }


        return Math.min(l, r);
    }


    public static int countTargetSumSubSequences(int index, int[] arr,
                                                 int targetSum, int currentSum) {

        // condition not satisfied
        // strictly done if array contains positives only
        if(currentSum>targetSum)
        {
            return 0;
        }
        if (index == arr.length) {
            if (currentSum == targetSum) {
                return 1;
            }
            return 0;
        }


        currentSum = currentSum + arr[index];
        int l = countTargetSumSubSequences(index + 1, arr, targetSum, currentSum);

        currentSum = currentSum - arr[index];
        int r = countTargetSumSubSequences(index + 1, arr, targetSum, currentSum);

        return l + r;
    }

    public static boolean targetSumFirstSequence(int index, int[] arr,
                                                 List<Integer> current,
                                                 List<List<Integer>> result, int targetSum, int currentSum) {

        if (index == arr.length) {
            if (currentSum == targetSum) {
                result.add(new ArrayList<>(current));
                return true;
            }
            return false;
        }

        current.add(arr[index]);
        currentSum = currentSum + arr[index];
        if (targetSumFirstSequence(index + 1, arr, current, result, targetSum, currentSum) == true) {
            return true;
        }
        current.remove(current.size() - 1);
        currentSum = currentSum - arr[index];
        if (targetSumFirstSequence(index + 1, arr, current, result, targetSum, currentSum) == true) {
            return true;
        }

        return false;
    }

    public static void targetSum(int index, int[] arr,
                                 List<Integer> current,
                                 List<List<Integer>> result, int targetSum, int currentSum) {

        if (index == arr.length) {
            if (currentSum == targetSum) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        current.add(arr[index]);
        currentSum = currentSum + arr[index];
        targetSum(index + 1, arr, current, result, targetSum, currentSum);
        current.remove(current.size() - 1);
        currentSum = currentSum - arr[index];
        targetSum(index + 1, arr, current, result, targetSum, currentSum);
    }


    private static void generateSubSequences(int index, int[] arr,
                                             List<Integer> current,
                                             List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // Make a copy of the current list
            return;
        }

        // Include the current element
        current.add(arr[index]);
        generateSubSequences(index + 1, arr, current, result);
        current.remove(current.size() - 1);

        // Exclude the current element
        generateSubSequences(index + 1, arr, current, result);
    }

    private static void generateSubSequencesReverse(int index, int[] arr,
                                                    List<Integer> current,
                                                    List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // Make a copy of the current list
            return;
        }

        // Include the current element
        generateSubSequences(index + 1, arr, current, result);
        current.add(arr[index]);
        generateSubSequences(index + 1, arr, current, result);
        current.remove(current.size() - 1);

        // Exclude the current element

    }

}

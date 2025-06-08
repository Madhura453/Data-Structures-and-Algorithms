package com.ds.recursion.subsets;

public class LengthOfLongestSubsequenceSum {

    public static void main(String[] args) {

        int[] arr={2,3,5,2};
        System.out.println(
                longestSubsequenceSum(arr,0,0,7,0,0)
        );
    }

    public static int longestSubsequenceSum(int[] arr,int index,int sum,int target,int max,
                                            int subSequenceLength)
    {
        if (index > arr.length - 1 || (sum>=target)) {
            if (sum == target) {
                return Math.max(max,subSequenceLength);
            }
            return max;
        }


        max =  longestSubsequenceSum(arr, index + 1, sum + arr[index], target,max,
                subSequenceLength+1);

        max = longestSubsequenceSum(arr, index + 1, sum, target,max,subSequenceLength);

        return max;
    }
}

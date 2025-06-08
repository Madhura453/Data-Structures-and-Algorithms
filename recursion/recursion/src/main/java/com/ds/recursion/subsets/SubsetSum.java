package com.ds.recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
//        printSubsetSum(arr,0,0L,5L,new ArrayList<>(),result);
//        result.forEach(System.out::println);
        boolean isSubsetSum = isSubsetSum(arr,0,0L,5L);
        System.out.println(isSubsetSum);
    }

    public static boolean isSubsetSum(int[] arr, int index, Long sum, long target)
    {
        System.out.println("Index: " + index + ", Sum: " + sum);
        if(index>arr.length-1)
        {
            return sum == target;
        }


//        if (isSubsetSum(arr,index+1,sum+arr[index],target))
//        {
//            return true;
//        }
//
//        return isSubsetSum(arr, index + 1, sum, target);


        return isSubsetSum(arr,index+1,sum+arr[index],target) ||// Include the current element
                isSubsetSum(arr, index + 1, sum, target);// Exclude the current element
        // both above methods are valid
        //
    }


    // Explanation for this return isSubsetSum(arr,index+1,sum+arr[index],target) ||// Include the current element
    //                isSubsetSum(arr, index + 1, sum, target);// Exclude the current element

    /*
    return isSubsetSum(...include...) || isSubsetSum(...exclude...);
   This line returns:

    true if either the include path or the exclude path returns true.

   It short-circuits, meaning:

    If the left side returns true, the right side is not even executed.

    If the left side returns false, only then the right side is executed.

   so finally at any point of recursion call if it finds true because of logical OR || it
   return true without executing any further recursion calls.

   Logical || in recursion means if one gives true It will stop further recursion calls to make.

Logical OR (||) in recursion means:
“The moment one path gives true, we stop and return true — no need to check the rest!”
     */

    public static List<List<Integer>> printSubsetSum(int[] arr, int index, Long sum, long target,
                                                     List<Integer> subArr, List<List<Integer>> result)
    {
        if(index>arr.length-1)
        {
            if(sum==target)
            {
                result.add(new ArrayList<>(subArr));
            }
            return result;
        }

        subArr.add(arr[index]);
        sum+=arr[index];
        // It is index adding in original array
        printSubsetSum(arr,index+1,sum,target,subArr,result);
        // Here we are removing element from sub array.
        // we are removing the current element we just added in previous step
        subArr.remove(subArr.size()-1);// subArr.remove(Integer.valueOf(arr[index]));
        sum-=arr[index];
        printSubsetSum(arr,index+1,sum,target,subArr,result);
        return result;
    }

}

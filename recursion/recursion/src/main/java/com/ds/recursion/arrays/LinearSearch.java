package com.ds.recursion.arrays;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
//        System.out.println(linearSearch(new int[]{1,7,8,9,23},8,0));
//
//        System.out.println(findAllIndex(new int[]{1,2,3,4,5,5},5,0,new ArrayList<>()));

        System.out.println(findAllIndexWithoutArgument(new int[]{6,5,4,3,1,2},4,0
                ));

    }

    // Same object but different reference variables.
    // Arrays are immutable. ALl reference variables are pointing to same object.
    // we are adding elements to list via different reference variables.
    // different recursion calls have different reference variables.All
    // reference variables are pointing to same object
    static int linearSearch(int arr[],int target, int index) {

        if(arr[index]==target)
        {
            return index;
        }

        if(index==arr.length-1)
        {
            return -1;
        }

        return linearSearch(arr,target,++index);
    }

    static List<Integer> findAllIndex(int[] arr, int target, int index, List<Integer> result)
    {
        if(index==arr.length)
        {
            return result;
        }

        if(arr[index]==target)
        {
            result.add(index);
        }

        return findAllIndex(arr,target,++index,result);
    }

    // Return the list without passing the argument

    static List<Integer> findAllIndexWithoutArgument(int[] arr, int target, int index)
    {
        List<Integer> result=new ArrayList<>();

        if(index==arr.length)
        {
            return result;
        }

        if(arr[index]==target)
        {
            result.add(index);
        }

        List<Integer> subResult = findAllIndexWithoutArgument(arr,target,++index);
        result.addAll(subResult);
        return result;
    }

}

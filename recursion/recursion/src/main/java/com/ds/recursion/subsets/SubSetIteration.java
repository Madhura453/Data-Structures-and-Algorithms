package com.ds.recursion.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetIteration {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        List<List<Integer>> result=subSetIteration(arr);

        for(List<Integer> e:result)
        {
            System.out.println(e);
        }

        // A normal index-based for loop avoids ConcurrentModificationException
        // because you're not using an iterator, and you control the index and iteration range explicitly.
//        List<Integer> d = new ArrayList<>(Arrays.asList(1, 2, 3));
//        //int e=d.size();
//        for (int r:d)
//        {
//            d.remove(0);
//        }


        List<List<Integer>> result1 = subSetIterationForDuplicates(new int[]{1, 2, 2, 3});

        for (List<Integer> e : result1) {
            System.out.println(e);
        }
    }


    // The acceptance and rejecting was happening the answer
    // we are so far
    public static List<List<Integer>> subSetIteration(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int i = 0; i < arr.length; i++) {
            int size = outer.size();

            for (int j = 0; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }

        }

        return outer;
    }

    public static List<List<Integer>> subSetIterationForDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end;
            }
            int n = outer.size();
            end = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }

        }

        return outer;
    }
}

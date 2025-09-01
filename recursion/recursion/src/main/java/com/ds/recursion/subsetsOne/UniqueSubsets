package com.ds.recursion.subsetsOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsets {

  public static void main(String[] args) {
    int[] arr = {1, 1, 1, 2, 2};

    List<List<Integer>> ans = new ArrayList<>();

    // sort the elements to avoid duplications

    Arrays.sort(arr);

    printUniqueSubsets(0, arr, ans, new ArrayList<>());

    ans.forEach(System.out::println);
  }


  private static void printUniqueSubsets(int index, int[] arr, List<List<Integer>> ans,
                                         List<Integer> ds) {

    ans.add(new ArrayList<>(ds));

    for (int i = index; i < arr.length; i++) {
      if (i > index && arr[i] == arr[i - 1]) {
        continue;
      }

      ds.add((arr[i]));

      printUniqueSubsets(i + 1, arr, ans, ds);

      ds.remove(ds.size() - 1);
    }
  }

}

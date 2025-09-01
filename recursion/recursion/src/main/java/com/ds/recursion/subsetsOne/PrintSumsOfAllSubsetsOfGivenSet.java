package com.ds.recursion.subsetsOne;

import java.util.ArrayList;
import java.util.List;

public class PrintSumsOfAllSubsetsOfGivenSet {

  public static void main(String[] args) {

    int[] arr = {3,1,2};

    List<Integer> result=subsetSums(0,0,arr);

    result.stream().forEach(System.out::println);
  }

  public static ArrayList<Integer> subsetSums(int index,int sum,int[] arr) {

    if(index>=arr.length)
    {
      ArrayList<Integer> result = new ArrayList<>();
      result.add(sum);
      return result;
    }

    ArrayList<Integer> r=new ArrayList<>();

    List<Integer> left=subsetSums(index+1,sum+arr[index],arr);

    r.addAll(left);

    List<Integer> right=subsetSums(index+1,sum,arr);

    r.addAll(right);

    return r;
  }
}

package com.ds.recursion.arrays;

public class FindArrayIsSort {

    public static void main(String[] args) {
      boolean r=arraySortedOrNot(new int[]{1,2,4,5,7});
    }

    public static boolean arraySortedOrNot(int[] arr) {

        if(arr.length==1)
        {
            return true;
        }
        return sort(arr,0,1);
    }

    public static boolean sort(int[] arr,int i,int j)
    {
        if(j==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[j])
        {
            return false;
        }
        return sort(arr,++i,++j);
    }

    public static boolean sort1(int[] arr,int i,int j)
    {
        if(j==arr.length-1)
        {
            return true;
        }

        return arr[i]<arr[j] && sort(arr,++i,++j);
    }

}

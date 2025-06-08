package com.ds.sorting.service;

import java.util.Arrays;

public class QuickSortPivotMiddle {

    public static void main(String[] args) {

        int[] arr = {95,13,47,52,41,68,42};

        quickSort(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(System.out::println);
    }

//    Hoare's partition scheme (not Lomuto)
//    In Hoare's partition, the partition() method does not guarantee that the element at partitionIndex is at its final sorted position. Instead, it ensures that:
//
//    All elements on the left of the returned index are ≤ pivot
//
//    All elements on the right of the returned index are ≥ pivot
//
//    But the element at the partitionIndex may still need to be re-evaluated in the recursive calls.


    static void quickSort(int arr[], int low, int high) {

        if(low<high)
        {
            int partitionIndex = partition(arr,low,high);

            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex,high);
        }

    }

    static int partition(int arr[], int i, int j) {

        int pivotIndex = (i+j) / 2;
        int pivot = arr[pivotIndex];

        while(i<=j)
        {

            while(arr[i]<pivot)
            {
                i++;
            }

            while(arr[j]>pivot)
            {
                j--;
            }

            if(i<=j)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }

        }


        return i;
    }
    // Function to sort an array using quick sort algorithm.
    // pivot middle is give best time complexity

}

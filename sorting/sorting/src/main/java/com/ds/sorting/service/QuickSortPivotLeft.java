package com.ds.sorting.service;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSortPivotLeft {

    public static void main(String[] args) {

        int[] arr = {4,6,2,5,7,9,1,3};

        quickSort(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(System.out::println);
    }


    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {

        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {

        int pivot = low;
        int i = low, j = high;

        while (i < j) {
            while (i <= high && arr[i] <= arr[pivot]) {
                i++; // finding greater element than pivot on the left
                // iterate find until smaller elements
            }

            while (j >= low && arr[j] > arr[pivot]) {
                j--;  // finding smaller element than pivot on the right
                //  iterate find until large elements
            }

            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
       // place smaller than pivot on left
        // place greater than pivot on right
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        return j;
    }

}

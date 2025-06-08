package com.ds.sorting.service;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {4, 1, 3, 9, 7};

        bubbleSort(arr);
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void bubbleSort(int arr[]) {

        int n = arr.length;

        boolean swap = false;

        for (int i = 0; i < n; i++) {

            // For each step max will come at last respective index
            for (int j = 1; j < n - i ; j++) {
                // when j never swap if swapping never occur for any value j then
                // it means array was sorted.
                // Swap the element it is smaller than previous item
                if (arr[j-1] > arr[j]) {
                    swap=true;
                    swap(arr, j-1, j );
                }

            }
            // The swap doesn't occur then array got sorted. No need further iterations
            if(!swap)
            {
                break; // No swaps? Array is already sorted hence we can end
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

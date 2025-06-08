package com.ds.recursion.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {4, 1, 3, 9, 7};

        bubbleSort(arr,0,1);
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void bubbleSort(int[] arr, int i, int j) {

        if(i>=arr.length-1 )
        {
            return;
        }

        if (arr[j-1] > arr[j]) {
            swap(arr, j-1, j );
        }

        if(j<arr.length-i-1)
        {
            bubbleSort(arr,i,j+1);
        }
        else
        {
            bubbleSort(arr,i+1,1);
        }

    }

    public static void swap(int[] arr, int m, int n) {

        int t = arr[m];
        arr[m] = arr[n];
        arr[n] = t;
    }
}

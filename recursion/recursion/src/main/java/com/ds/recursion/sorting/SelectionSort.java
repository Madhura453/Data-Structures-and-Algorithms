package com.ds.recursion.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr={1, 5, 3, 2};
        SelectionSort(arr,0,1);
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }

    public static void SelectionSort(int[] arr, int i, int j)
    {

        if(i>=arr.length-1)
        {
            return;
        }

        if(arr[i]>arr[j])
        {
            swap(arr,i,j);
        }

        if(j<arr.length-1)
        {
            SelectionSort(arr,i,++j);
        }
        else
        {
            SelectionSort(arr,++i,i+1);
        }
    }


    public static void swap(int[] arr,int i,int j)
    {
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]=t;
    }
}

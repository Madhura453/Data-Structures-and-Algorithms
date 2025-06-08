package com.ds.sorting.service;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr={1, 5, 3, 2};
        sortTheArray(arr);
        for(int a:arr)
        {
            System.out.println(a);
        }
    }

    public static void sortTheArray(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    swap(arr,i,j);
                }
            }
        }

        //sArrays.sort(arr);
    }


    public static void swap(int[] arr,int i,int j)
    {
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]=t;
    }
}

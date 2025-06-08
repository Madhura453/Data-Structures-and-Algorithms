package com.ds.sorting.service;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {4, 1, 3, 9, 7};
        mergeSort(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(System.out::println);

    }

    static void mergeSort(int arr[], int l, int r) {

        if(l==r)
        {
            return;
            // l==r means it is dividing until single element
        }

        int mid = (l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        mergeArrays(arr,l,mid,r);
    }

    static void mergeArrays(int arr[], int l, int mid,int r)
    {

        int[] temp = new int[r-l+1];

        int low =l,high=mid+1;
        int i=0;
        while(low<=mid && high<=r)
        {
            if(arr[low]<arr[high])
            {
                temp[i]=arr[low];
                low++;
            }
            else
            {
                temp[i]=arr[high];
                high++;
            }

            i++;
        }


        while(low<=mid)
        {
            temp[i]=arr[low];
            low++;
            i++;
        }

        while(high<=r)
        {
            temp[i]=arr[high];
            high++;
            i++;
        }

        for(i=0;i<temp.length;i++)
        {
            arr[l+i]=temp[i];
        }

    }
}

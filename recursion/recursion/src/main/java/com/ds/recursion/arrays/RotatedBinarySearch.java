package com.ds.recursion.arrays;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{5, 6, 7, 8, 9, 10},10));
    }

    //[5, 6, 7, 8, 9, 10, 1, 2, 3]
    public static int binarySearch(int[] arr, int k)
    {
        int l=0,r=arr.length-1;

        while (l<=r)
        {
            int mid = (l+r)/2;

            if(arr[mid]==k)
            {
                return mid;
            }

            if( arr[mid]>=arr[l])
            {

                if(arr[l]<=k && arr[mid]>k)
                {
                    r=mid-1;
                }
                else {
                    l=mid+1;
                }

            }
            else
            {
                if(arr[mid]<k && arr[r]>=k)
                {
                    l=mid+1;
                }
                else {
                    r=mid-1;
                }
            }
        }

        return -1;
    }

}

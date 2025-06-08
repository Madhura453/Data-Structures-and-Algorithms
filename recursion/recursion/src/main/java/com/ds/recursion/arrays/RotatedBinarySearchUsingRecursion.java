package com.ds.recursion.arrays;

public class RotatedBinarySearchUsingRecursion {

    public static void main(String[] args) {

        int[] a=new int[]{5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(new int[]{5, 6, 7, 8, 9, 10}, 10,0,a.length-1));
    }

    //[5, 6, 7, 8, 9, 10, 1, 2, 3]
    public static int binarySearch(int[] arr, int k, int l, int r) {

        if (l <= r) {
            return -1;
        }

        int mid = (l + r) / 2;

        if (arr[mid] == k) {
            return mid;
        }

        if (arr[mid] >= arr[l]) {// checking the element in sorted order 5 6 7 8 9 13// l=5 mid=9 r=13

            if (arr[l] <= k && arr[mid] > k) {
                return binarySearch(arr, k, l, mid - 1);
            } else {
                return binarySearch(arr, k, mid + 1, r);
            }

        } else   {//// checking the element not in sorted order 10 12 1 2 3
            if (arr[mid] < k && arr[r] >= k) {
                return binarySearch(arr, k, mid + 1, r);
            } else {
                return binarySearch(arr, k, l, mid - 1);
            }
        }
    }
}

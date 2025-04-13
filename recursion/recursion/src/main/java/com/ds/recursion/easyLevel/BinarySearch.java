package com.ds.recursion.easyLevel;

public class BinarySearch {
    public static void main(String[] args) {
    }
    public static int binarySearch(int[] arr, int target, int result, int l, int r) {
        
        if(l>r)
        {
            return result;
        }

        int mid=(l+r)/2;

        if(arr[mid]== target)
        {
            result= mid;
            r=mid-1;
        }
        else if(target <arr[mid])
        {
            r=mid-1;
        }
        else
        {
            l=mid+1;
        }
        return binarySearch(arr, target,result,l,r);
    }
}

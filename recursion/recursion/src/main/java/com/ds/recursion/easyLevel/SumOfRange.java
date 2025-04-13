package com.ds.recursion.easyLevel;

public class SumOfRange {
    public static void main(String[] args) {

        int r= sumOfRange(4);
        System.out.println(r);
    }

    static int sumOfRange(int n)
    {
        if(n<=1)
        {
            return 1;
        }

        return n+ sumOfRange(n-1);
    }
}

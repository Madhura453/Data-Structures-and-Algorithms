package com.ds.recursion.easyLevel;

public class Factorial {

    public static void main(String[] args) {

        int r=factorial(4);
        System.out.println(r);
    }

    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }

        return n*factorial(n-1);
    }
}

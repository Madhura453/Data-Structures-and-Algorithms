package com.ds.recursion.easyLevel;

public class DigitSum {

    public static void main(String[] args) {
        int r= digitSum(123,0);
        System.out.println(r);
    }

    static int digitSum(int n, int sum)
    {
        if(n<=0)
        {
            return n;
        }

        sum=n%10;

        return sum+ digitSum(n/10,sum);
    }
}

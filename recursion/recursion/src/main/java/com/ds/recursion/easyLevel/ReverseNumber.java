package com.ds.recursion.easyLevel;

public class ReverseNumber {

    public static void main(String[] args) {

//        int n= (int) Math.log10(123);
//        System.out.println(n);
//        int r=reverse(123,0);
//        System.out.println(r);
        int r1 =  reverse1(123985);//589321
        System.out.println(r1);
    }

    public static int reverse(int n,int r)
    {
        if(n<=0)
        {
            return r;
        }
        r = r*10+n%10;
       return reverse(n/10,r);
    }

    public static int reverse1(int n)
    {
        int digits = (int) Math.log10(n);
        return helper(n,digits);
    }

    public static int helper(int n,int digits)
    {
        if(n<=0)
        {
            return n;
        }

        return (n%10)*((int) Math.pow(10,digits))+ helper(n/10,--digits);
    }


}

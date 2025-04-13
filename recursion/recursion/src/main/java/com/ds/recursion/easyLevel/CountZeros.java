package com.ds.recursion.easyLevel;

public class CountZeros {

    public static void main(String[] args) {

        int result = countZeros(902030400,0);
        System.out.println(result);

        int result1 = countZeros1(902030400);
        System.out.println(result1);
    }

    public static int countZeros(int n,int count)
    {
        if(n%10==n)
        {
            return count;
        }
        if(n%10==0)
        {
            count++;
        }
       return countZeros(n/10,count);
    }



    public static int countZeros1(int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(n%10==0)
        {
           return 1+countZeros1(n/10);
        }

        return countZeros1(n/10);
    }
}

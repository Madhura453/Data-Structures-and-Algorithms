package com.ds.recursion.easyLevel;

public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) {
         int r=steps(5,0);
        System.out.println(r);
    }

    public static int steps(int n,int c)//5
    {

        if(n==0)
        {
            return c;
        }

      n=n%2==0?n/2:n-1;
      return 1+steps(n,c);
    }
}

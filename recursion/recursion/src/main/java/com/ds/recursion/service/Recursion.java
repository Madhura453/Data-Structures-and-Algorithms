package com.ds.recursion.service;

public class Recursion {

    public static int count=0;

    public static void main(String[] args)
    {
        fibonacci(4);

       // infiniteLoop();
        //finiteLoop();

        // printName(0,5);

      //  linerReverse(5);

     //   backTracking(5);
       // backTrackingReverse(0,5);

     //  System.out.println(printSum(5));

        //System.out.println(reverseN(71223451,0));

     //   System.out.println(factorial(5));

        int[] a=new int[]{1,2,5,6,7,9};

       // reverseArray(a,0,a.length-1);
//        reverseArray1(a,0);
//        Arrays.stream(a).forEach(System.out::println);

  //     System.out.println(palindrome("madhuhdam",0));

     //   System.out.println(fibonacci(4));
        System.out.println(climbingStairs(0,5));

    }


    static int climbingStairs(int index,int n)
    {
        if(n==index)
        {
            return 1;
        }

        if(n<index)
        {
            return 0;
        }

        int l=climbingStairs(index+1,n);

        int r=climbingStairs(index+2,n);

        return l+r;

    }

    public static  int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int last=fibonacci(n-1);
        int slast=fibonacci(n-2);
        return last+slast;
    }

    private static boolean palindrome(String s, int i) {

        if(i>s.length()/2)
        {
            return true;
        }

        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }

        return palindrome(s,i+1);
    }

    public static void reverseArray1(int[] a,int l)
    {

        if(l>=a.length/2)
        {
            return;
        }

        int t=a[l];
        a[l]=a[a.length-l-1];
        a[a.length-l-1]=t;

        reverseArray1(a,l+1);
    }

    public static void reverseArray(int[] a,int l,int r)
    {
        if(l>=r)
        {
            return;
        }

        int t=a[l];
        a[l]=a[r];
        a[r]=t;

       reverseArray(a,l+1,r-1);
    }

    private static int factorial(int n) {
        if(n==1)
        {
            return 1;
        }
        return factorial(n-1)*n;
    }

    private static int reverseN(int n,int r) {

        if(n<=0)
        {
            return r;
        }

        r=(r*10+(n%10));
        return reverseN(n/10,r);
    }

    private static int printSum(int n) {

        if(n==0) {
            return 0;
        }

        return printSum(n-1)+n;
    }

    private static void  backTrackingReverse(int i,int n) {
        if(i>=n)
        {
            return;
        }

        backTrackingReverse(++i,n);

        System.out.println(i);
    }

    private static void backTracking(int n) {
        if(n<=1)
        {
            return;
        }

        backTracking(--n);

        System.out.println(n);
    }

    private static void linerReverse(int n) {

        if(n<0)
        {
            return;
        }
        System.out.println(n);

        linerReverse(--n);
    }
    private static void printName(int i, int n) {

        if(i==n)
        {
            return;
        }
        System.out.println("madhura");

        printName(i+1,n);
    }

    public static void finiteLoop()
    {
        if(count==4)
        {
            return;
        }
        else
        {
            System.out.println(count);
        }
        count++;
        finiteLoop();

    }
    public static void infiniteLoop()
    {
          System.out.println(1);
          infiniteLoop();
          // Exception in thread "main" java.lang.StackOverflowError be
    }
}




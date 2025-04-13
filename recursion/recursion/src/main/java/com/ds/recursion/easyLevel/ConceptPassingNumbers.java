package com.ds.recursion.easyLevel;

public class ConceptPassingNumbers {

    public static void main(String[] args) {

      //  fun(5);
        fun1(5);
    }

    private static void fun(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        fun(n--);
        // stack overflow error . Because first it pass N then subtract -1
    }

    private static void fun1(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        fun1(--n);
     // first it will subtract then it pass. So it will be success.
    }
}
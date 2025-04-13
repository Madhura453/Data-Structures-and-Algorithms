package com.ds.recursion.easyLevel;

public class Palindrome {

    public static void main(String[] args) {

        boolean result= palindrome("aca");
        System.out.println(result);

        boolean result1= palindrome("acaa");
        System.out.println(result1);
    }
    static boolean palindrome(String s)
    {
         return helper(s,0,s.length()-1);
    }
    static boolean helper(String s,int l,int r)
    {
         if(l>=r)
         {
             return true;
         }

         if(s.charAt(l)!=s.charAt(r))
         {
             return false;
         }

         return helper(s,++l,--r);
    }

}

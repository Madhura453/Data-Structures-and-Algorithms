package com.ds.recursion.strings;

public class ReverseString {

    public static void main(String[] args) {
       // System.out.println("ab".substring(1));
        System.out.println(reverse("abc"));
    }

    public static String reverse(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
}

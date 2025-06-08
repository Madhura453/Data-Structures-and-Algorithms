package com.ds.recursion.strings;

public class RemoveCharacterA {

    public static void main(String[] args) {
        String s = "abga";

       // String result= "";

       // removeA(s,result);

        System.out.println(removeChar("abga"));

    }

    public static void removeA(String s,String result) {

        if(s.isEmpty())
        {
            System.out.println(result);
            return;
        }

        if(s.charAt(0)=='a')
        {
            removeA(s.substring(1),result);
        }
        else
        {
            removeA(s.substring(1),result+s.charAt(0));
        }
    }

    public static String removeChar(String s) {

        if(s.isEmpty())
        {
            return "";
        }

        String r="";
        if(s.charAt(0)=='a')
        {
            return r+removeChar(s.substring(1));
        }
        else
        {
            return r+s.charAt(0)+removeChar(s.substring(1));
        }

    }
}

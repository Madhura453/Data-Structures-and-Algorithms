package com.ds.recursion.permutation.strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {

        String s= "abc";
       List<String> result = permutation("",s);

        result.stream().forEach(System.out::println);

       // System.out.println(countPermutation("",s));

    }

    public static List<String> permutation(String p, String up)
    {
        if(up.isEmpty())
        {
            List<String> r=new ArrayList<>();//local to this call
            r.add(p);
            return r;
        }

        List<String> result=new ArrayList<>();//local to this call
        int n=p.length()+1;

        for(int i=0;i<n;i++)
        {

           List<String> subPermutationResult =
                   permutation(p.substring(i)+up.charAt(0)+p.substring(0,i),
                   up.substring(1));

           result.addAll(subPermutationResult);
        }

        return result;
    }

    public static int countPermutation(String p, String up)
    {
       int count =0;//local to this call

        if(up.isEmpty())
        {
            return 1;
        }

        int n=p.length()+1;

        for(int i=0;i<n;i++)
        {
            int subCount=  countPermutation(p.substring(i)+up.charAt(0)+p.substring(0,i),
                            up.substring(1));
            count=count+subCount;
        }

        return count;
    }


}

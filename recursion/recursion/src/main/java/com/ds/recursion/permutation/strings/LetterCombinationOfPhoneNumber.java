package com.ds.recursion.permutation.strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

    public static void main(String[] args) {
        String up="233";
      //  letterCombinations("",up).forEach(System.out::println);
        System.out.println(countLetterCombinations("",up));
    }

    public static int countLetterCombinations(String p, String up) {

        List<String> words = List.of("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
                "wxyz");

        if (up.isEmpty()) {

            return 1;
        }

       int count = 0;

        int c=up.charAt(0)-48;
        String s = words.get(c);

        for (int i = 0; i < s.length(); i++) {

           count =count+
                   countLetterCombinations(p + s.charAt(i), up.substring(1));
        }

        return count;
    }

    public static List<String> letterCombinations(String p, String up) {

        List<String> words = List.of("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
                "wxyz");

        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> result = new ArrayList<>();

        int c=up.charAt(0)-48;
        String s = words.get(c);

        for (int i = 0; i < s.length(); i++) {

            List<String> subRecursionResult =
                    letterCombinations(p + s.charAt(i), up.substring(1));

            result.addAll(subRecursionResult);
        }

        return result;
    }


    public static List<String>  LetterCombinationOfPhoneNumber(String p,String up)
    {

        List<String> result=new ArrayList<>();//local to this call

        if(up.isEmpty())
        {
            result.add(p);
            return result;
        }

        return result;
    }
}

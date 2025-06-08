package com.ds.recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {

        // subSequencePrint("","abc");

        // List<String> result = subSequence("","abc");

        List<String> result = subSequence("", "abc");


        result.stream().forEach(System.out::println);

    }

    public static void subSequencePrint(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subSequencePrint(p + c, up.substring(1));
        subSequencePrint(p, up.substring(1));
    }

    public static List<String> subSequence(String p, String up) {
        if (up.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }
        char c = up.charAt(0);
        List<String> left = subSequence(p + c, up.substring(1));
        List<String> right = subSequence(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static List<String> subSequence(String p, String up, List<String> result) {
        if (up.isEmpty()) {
            result.add(p);
            return result;
        }
        char c = up.charAt(0);
        subSequence(p + c, up.substring(1));
        subSequence(p, up.substring(1));
        return result;
    }

}

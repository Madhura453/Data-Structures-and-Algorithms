package com_ds.algorithms.KnuthMorrisPratternAlgorithms;

import java.util.ArrayList;

public class SearchPattern {

    public static void main(String[] args) {
        System.out.println(search("aa","aaaa"));
        // https://youtu.be/GTJr8OvyEVQ?si=7YKthwrzGAj5LyF0
        // https://youtu.be/KG44VoDtsAA?si=zEmVhgSYeuR6qdIE
    }

    static ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer> l=new ArrayList<>();

        int[] kmp=lps(pat);

        int i=0,j=0;

        int n=txt.length(),m=pat.length();

        while(i<n&&j<m)
        {
            if(txt.charAt(i)==pat.charAt(j))
            {
                i++;
                j++;
            }
            else if(j==0)
            {
                i++;
            }
            else
            {
                j=kmp[j-1];
            }

            ///System.out.println(j+" "+m);
            if(j==m)
            {
                l.add( (i-j)+1);
                j=kmp[j-1];
            }
        }


        return l;
    }

    static int[] lps(String pat)
    {
        int n=pat.length();
        int[] kmp=new int[n];
        int i=1,j=0;

        while(i<n)
        {
            if(pat.charAt(i)==pat.charAt(j))
            {
                kmp[i]=j+1;
                i++;
                j++;
            }
            else if(j==0)
            {
                i++;
            }
            else
            {
                j=kmp[j-1];
            }
        }

        return kmp;
    }
}

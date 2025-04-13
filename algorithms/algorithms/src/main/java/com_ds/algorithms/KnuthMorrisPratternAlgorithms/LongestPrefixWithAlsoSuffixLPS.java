package com_ds.algorithms.KnuthMorrisPratternAlgorithms;

public class LongestPrefixWithAlsoSuffixLPS {

    public static void main(String[] args)
    {

        System.out.println(lps("abcab"));
    }

    static int lps(String str) {
        // code here

        int n=str.length();

        int[] kpm=new int[n];

        int j=0;

        int i=1;

        while(i<n)
        {

            if(str.charAt(i)==str.charAt(j))
            {
                kpm[i]=j+1;
                j++;
                i++;
            }
            else if(j==0)
            {

                kpm[j]=0;
                i++;
            }
            else
            {
                j=kpm[j-1];
            }

        }

        return kpm[n-1];
    }
}

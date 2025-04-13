package com.ds.recursion.service;

public class TwoDimensionalRecursion {
/*
https://www.naukri.com/code360/problems/ninja-s-training_3621003?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=
striver_dp_videos&count=25&page=1&search=&sort_entity=order&sort_order=ASC
 */
    public static void main(String[] args)
    {
       // int c=trainingR(n-1,3,points);
        //4
        //3
        int[][] array = {
                {94, 74, 84},
                {71, 4, 68},
                {70, 12, 17},
                {7, 84, 58},
 //               {59, 69, 2},
//                {57, 21, 62},
//                {74, 54, 15},
//                {15, 83, 49},
//                {97, 70, 90},
//                {8, 71, 42}
        };

        System.out.println(trainingR(array.length-1,3,array));
        // last 3 means no task performed

    }

    public static int trainingR(int day,int last, int tasks[][]) {

        if(day==0)
        {
            int max=0;
            for(int i=0;i<=2;i++)
            {
                if(last!=i)
                {
                    max=Math.max(max,tasks[day][i]);
                }
            }

            return max;
        }
        int max=0,points=0;
        for(int i=0;i<=2;i++)
        {
            if(last!=i)
            {
                points=tasks[day][i]+trainingR(day-1,i,tasks);
                max=Math.max(points,max);
            }
        }
        return Math.max(points,max);
    }
}

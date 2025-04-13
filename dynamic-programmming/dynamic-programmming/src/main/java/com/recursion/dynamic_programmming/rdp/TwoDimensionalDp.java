package com.recursion.dynamic_programmming.rdp;

import java.util.Arrays;

public class TwoDimensionalDp {


    public static void main(String[] args) {
        // int c=trainingR(n-1,3,points);
        //4
        //3
        int[][] array = {
                {2,1,3},
                {3,4,6},
                {10, 1, 6},
                {8, 3, 7},
        };
        int n = array.length;
        int[][] dp = new int[n][4];
        for (int[] f : dp) {
            Arrays.fill(f, -1);
        }
      //  System.out.println(memoraztionTrainingR(array.length - 1, 3, dp, array));
        // last 3 means no task performed
        tabulaTrainingR(array.length, array);
//        spaceOptimaztionTrainingR(array.length, array);
//
//        System.out.println(spaceOptimaztionTrainingR(n,array));
    }

    public static int spaceOptimaztionTrainingR(int n, int tasks[][]) {

        int[] previous = new int[4];

        previous[0] = Math.max(tasks[0][1], tasks[0][2]);
        previous[1] = Math.max(tasks[0][0], tasks[0][2]);
        previous[2] = Math.max(tasks[0][0], tasks[0][1]);
        previous[3] = Math.max(previous[0], Math.max(previous[1], previous[2]));

        for (int day = 1; day < n; day++) {
            int[] temp = new int[4];
            for (int last = 0; last <= 3; last++) {
                temp[last]=0;
                for (int task = 0; task <= 2; task++) {
                    if (last != task) {
                       int points = tasks[day][task] + previous[task];
                       temp[last] = Math.max(temp[last], points);
                    }

                }

            }

            previous=temp;
        }


        return previous[3];
    }

    public static int tabulaTrainingR(int n, int tasks[][]) {

        int[][] dp = new int[n][4];
        for (int[] f : dp) {
            Arrays.fill(f, -1);
        }
        dp[0][0] = Math.max(tasks[0][1], tasks[0][2]);
        dp[0][1] = Math.max(tasks[0][0], tasks[0][2]);
        dp[0][2] = Math.max(tasks[0][0], tasks[0][1]);
        dp[0][3] = Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2]));

        for (int day = 1; day < n; day++) {
            for (int last = 0; last <= 3; last++) {
                for (int task = 0; task <= 2; task++) {
                    if (last != task) {
                        int points = tasks[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], points);
                    }

                }

            }
        }


        return dp[n - 1][3];
    }

    public static int memoraztionTrainingR(int day, int last, int dp[][], int tasks[][]) {

        if (day == 0) {
            int max = 0;
            for (int i = 0; i <= 2; i++) {
                if (last != i) {
                    max = Math.max(max, tasks[day][i]);
                }
            }

            return max;
        }
        if (dp[day][last] != -1) {
            return dp[day][last];
        }
        int max = 0, points = 0;
        for (int i = 0; i <= 2; i++) {
            if (last != i) {
                points = tasks[day][i] + memoraztionTrainingR(day - 1, i, dp, tasks);
                max = Math.max(points, max);
            }
        }

        if (dp[day][last] == -1) {
            dp[day][last] = max;
        }

        return Math.max(points, max);
    }

}
package com.ds.recursion.pattrenQuestions;

public class RightAngleTriangle {

    public static void main(String[] args) {
        // rightAngle(5);
        //  rightAngleUsingLoop(5);

        //rightAngle(5, 0);
        angle(3,0);
    }

    public static void rightAngleUsingLoop(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void rightAngle(int n, int row) {
        if (n <= 0) {
            return;
        }

        if(row<n)
        {
            System.out.print("* ");
            rightAngle(n,++row);
        }
        else{
            System.out.println();
            rightAngle(--n, 0);
        }

    }

    public static void angle(int n, int row) {
        if (n <= 0) {
            return;
        }

        if(row<n)
        {
            angle(n,row+1);
            System.out.print("* ");
        }
        else{
            angle(n-1, 0);
            System.out.println("jgjjg");
        }

    }

}

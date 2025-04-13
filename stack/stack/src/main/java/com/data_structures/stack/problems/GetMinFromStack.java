package com.data_structures.stack.problems;

import java.util.Stack;

public class GetMinFromStack {

    int minEle;
    Stack<Integer> stack;

    // Constructor
    GetMinFromStack()
    {
        minEle=Integer.MIN_VALUE;
        stack=new Stack<>();
    }


    int getMin()
    {
        if(stack.isEmpty())
        {
            return -1;
        }
        return minEle;
    }


    int pop()
    {
        if(stack.isEmpty())
        {
            return -1;
        }

        int ele=stack.pop();
        if(minEle>ele)
        {
            return minEle;
        }

        return ele;
    }

    /*push element x into the stack*/
    void push(int value)
    {
        if(stack.isEmpty())
        {
            stack.push(value);
            minEle=value;
        }

        if(minEle>value)
        {
            int newValue=2*value-minEle;
            stack.push(newValue);
            minEle=value;
        }
        else
        {
            stack.push(value);
        }
    }
}

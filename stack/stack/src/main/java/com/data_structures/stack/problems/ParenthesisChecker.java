package com.data_structures.stack.problems;

import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args) {

    }



    static boolean ispar(String s)
    {
        Stack<Character> stack=new Stack<>();

        for(char c:s.toCharArray())
        {

            if(c=='[' || c=='{' || c=='(')
            {
                stack.push(c);
            } else {
                if(stack.isEmpty())
                {

                    return false;
                }

                char top=stack.pop();//({[

                if( (c=='}'&&top!='{') || (c==')'&&top!='(') || (c==']'&&top!='[') )
                {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
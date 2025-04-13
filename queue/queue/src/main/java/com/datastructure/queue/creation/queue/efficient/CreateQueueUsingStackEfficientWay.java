package com.datastructure.queue.creation.queue.efficient;

import java.util.Stack;

public class CreateQueueUsingStackEfficientWay {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.push(5);  // Queue: 5
        queue.push(6);  // Queue: 5 6
        queue.pop();    // Queue: 6 (removes 5)
        queue.display(); // Output: 6
        System.out.println("Front: " + queue.top()); // Output: Front: 6
        queue.push(9);  // Queue: 6 9
        queue.push(10); // Queue: 6 9 10
        queue.push(7);  // Queue: 6 9 10 7
        queue.pop();    // Queue: 9 10 7 (removes 6)
        queue.pop();    // Queue: 10 7 (removes 9)
        queue.display(); // Output: 10 7
    }
}


class Queue
{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void push(int x) {
        System.out.println("The element pushed is " + x);
        input.push(x);
    }

    public int pop()
    {
        if(output.isEmpty())
        {
            while (!input.isEmpty())
            {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
           return -1;
        }

        return output.pop();
    }

    public int top()
    {
        if(output.isEmpty())
        {
            while (!input.isEmpty())
            {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            return -1;
        }

        return output.peek();
    }

    public int size() {
        return input.size() + output.size();
    }

    public void display() {
        Stack<Integer> tempInput = (Stack<Integer>) input.clone();
        Stack<Integer> tempOutput = (Stack<Integer>) output.clone();

        // Print elements from output stack (already in front of the queue)
        while (!tempOutput.isEmpty()) {
            System.out.print(tempOutput.pop() + " ");
        }

        // Print elements from input stack (will be in the queue order)
        while (!tempInput.isEmpty()) {
            System.out.print(tempInput.peek() + " ");
            tempInput.pop();
        }

        System.out.println(); // Newline for better readability
    }
}
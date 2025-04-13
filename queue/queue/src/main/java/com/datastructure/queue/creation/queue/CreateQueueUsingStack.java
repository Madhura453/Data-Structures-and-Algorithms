package com.datastructure.queue.creation.queue;

import java.util.Stack;

public class CreateQueueUsingStack {

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
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();

    public void  push(int value)
    {
        while (!input.isEmpty())
        {
            output.push(input.pop());
        }

        input.push(value);

        while (!output.isEmpty())
        {
            input.push(output.pop());
        }
    }

    public int pop() {
        if (input.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return input.pop();
    }


    public int peek() {
        if (input.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return input.peek();
    }

    public int size() {
        return input.size();
    }

    public void display() {
        if (input.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Elements in the queue:");
        for (int i = input.size() - 1; i >= 0; i--) {
            System.out.println(input.get(i));
        }
    }

    public int top() {
        if (input.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return input.peek();
    }
}
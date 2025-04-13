package com.data_structures.stack.creation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CreateStackUsingQueue {

    public static void main(String[] args) {
       Stack stack = new Stack();

        stack.push(5);
        stack.push(6);
        stack.pop();//6
        stack.display();
        System.out.println( "top"+stack.top());//5
        stack.push(9);//5 9
        stack.push(10);// 5 9 10
        stack.push(7);// 5 9 10 7
        stack.pop();// 5 9 10
        stack.pop();// 5 9
        stack.display();

    }
}

class Stack
{
    public Queue<Integer> queue;

    public Stack()
    {
        this.queue=new LinkedList<>();
    }

    public void  push(int value)
    {
        int size=queue.size();
        queue.offer(value);
        for (int i=0;i<size;i++)
        {
            queue.offer(queue.poll());
        }
    }

    public int pop()
    {
        if (queue.isEmpty()) {
           return -1;
        }
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.peek();  // Peek at the front element
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        for (Integer element : queue) {
            System.out.println(element);
        }
    }
}
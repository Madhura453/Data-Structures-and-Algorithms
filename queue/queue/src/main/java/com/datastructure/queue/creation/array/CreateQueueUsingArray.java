package com.datastructure.queue.creation.array;

public class CreateQueueUsingArray {

    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.push(12);
        queue.push(2);
        queue.display();
        queue.pop();
        System.out.println(queue.top());
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.display();
        queue.pop();
        queue.display();


    }
}

class Queue {
    private int[] queue;

    private int front;

    private int rear;

    private int currentSize;

    private int size;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
        currentSize = 0;
    }

    public void push(int value) {
        if (isFull()) {
            return;
        }

        if (currentSize == 0) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = value;
        currentSize++;
    }

    public Integer pop() {
        if (currentSize == 0) {
            return null;
        }

        int element = queue[front];

        if (currentSize == 1) {
            rear = -1;
            front = -1;
        } else {
            front = (front + 1) % size;
        }
        currentSize = currentSize - 1;
        return element;
    }

    public Integer top() {
        if (currentSize == 0) {
            return null;
        }

        return queue[front];
    }

    public int size() {
        return currentSize;
    }

    public boolean isFull() {
        return currentSize == size;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void display()
    {
        if(isEmpty())
        {
            return;
        }

        for (int i=0;i<currentSize;i++)
        {
            int index=(front+i)%size;
            System.out.print(queue[index] + " ");
        }

        System.out.println();
    }
}
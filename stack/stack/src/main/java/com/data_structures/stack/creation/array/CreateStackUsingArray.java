package com.data_structures.stack.creation.array;

public class CreateStackUsingArray {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(12);
        stack.pop();
        stack.peek();
        stack.push(9);
        stack.push(1);
        stack.push(7);
        stack.push(6);
        stack.push(2);
        stack.push(3);
        stack.display();
    }
}

class Stack {
    private int size;

    private int top;

    private int[] stackArray;

    public Stack(int size) {
        this.size = size;
        top = -1;
        stackArray = new int[size];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Unable to push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Unable to pop.");
            return -1;
        }

        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        }

        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == (size - 1));
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");

        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
    }
}






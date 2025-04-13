package com.datastructure.queue.creation.list;

import com.datastructure.queue.model.Node;

public class CreateQueueUsingLinkedList {

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
    Node front;

    Node rear;

    int size;

    public Queue() {
        this.size =0;
        this.front=null;
        this.rear=null;
    }

    public void push(int value)
    {
       Node newNode=new Node(value);
       if(front==null)
       {
           front=newNode;
       }
       else
       {
           rear.next=newNode;
       }

        rear=newNode;
        size=size+1;
    }

    public int pop()
    {
         if(isEmpty())
         {
           return -1;
         }
         int element=front.data;
         front=front.next;
         if(front==null)
         {
             rear=null;
         }
         size=size-1;
         return element;
    }

    public int top()
    {
         if(isEmpty())
         {
             return -1;
         }

         return front.data;
    }

    public boolean isEmpty()
    {
        return front==null;
    }

    public int size()
    {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp=front;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();
    }
}

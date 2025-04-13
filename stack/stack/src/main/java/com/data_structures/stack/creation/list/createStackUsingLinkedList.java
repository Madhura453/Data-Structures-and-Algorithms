package com.data_structures.stack.creation.list;

import com.data_structures.stack.model.Node;

public class createStackUsingLinkedList {

    public static void main(String[] args) {

        /*
if stack is 5 6 7 8 9

null<-5<-6<-7<-8<-9
 */
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

class Stack {
    public Node top;

    public int size;

    public Stack() {
        this.top=null;
        this.size=0;
    }

    public void push(int value)
    {
        Node temp=new Node(value);
        temp.next=top;
        top=temp;
        size=size+1;
    }

    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        int element=top.data;

       // Node temp=top;
        top=top.next;
       // temp.next=null;
        size=size-1;
        return element;
        /*
        Changing top to top.next makes the old node unreachable and eligible for garbage collection.
        No Need for Manual Link Removal: Explicitly breaking links in nodes (e.g., temp.next = null;) is unnecessary for garbage collection.
        Code Simplicity:
        Removing redundant code (like temp.next = null;) simplifies the implementation without affecting functionality.

         */
    }

    public boolean isEmpty()
    {
        return top==null;
    }

    public int size()
    {
        return size;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println(" No data");
            return;
        }
         Node temp=top;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public int top()
    {
        if (isEmpty())
        {
            return -1;
        }

        return top.data;
    }
}
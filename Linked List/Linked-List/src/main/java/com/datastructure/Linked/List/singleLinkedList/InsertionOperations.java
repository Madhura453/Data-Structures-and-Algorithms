package com.datastructure.Linked.List.singleLinkedList;

import com.datastructure.Linked.List.singleLinkedList.model.Node;

import java.util.Stack;

public class InsertionOperations {

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 5, 7, 4,3};
        Node head= arrayToLinkedList(arr);
      //  insertAtBeginning(head,7);

      //  insertAtTail(head, 19);

      //  insertNode(head,13,8);

       // insertByValue(head, 3,9);
      //  traverse(reverseListUsingStack(head));
       // traverse(reverseList(head));
        traverse(reverseListUsingRecursion(head));
    }

    static Node reverseListUsingRecursion(Node head) {

        if(head==null || head.next==null)
        {
            return head;
        }

        Node newNode=reverseListUsingRecursion(head.next);

        Node front=head.next;
        front.next=head;
        head.next=null;

        return newNode;
    }

    private static Node reverseList(Node head) {

        Node temp=head;
        Node previous=null;
        while (temp!=null)
        {
            Node front = temp.next;
            temp.next=previous;
            previous=temp;
            temp=front;
        }

        return previous;
    }

    static Node reverseListUsingStack(Node head) {

        Stack<Integer> stack = new Stack<>();
        Node temp=head;
        while (temp!=null)
        {
            stack.push(temp.data);
            temp=temp.next;
        }

        temp=head;

        while (!stack.isEmpty())
        {
            temp.data=stack.peek();
            stack.pop();
            temp=temp.next;
        }
        return head;


    }
    private static Node insertAtTail(Node head, int x) {

        if(head==null)
        {
            return new Node(x);
        }

        Node temp=head;

        while (temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=new Node(x,null);
        traverse(head);
        return head;
    }

    public static Node insertAtBeginning(Node head, int x) {

        Node temp = new Node(x,head);
        traverse(temp);
        return temp;
    }

    private static Node insertByValue(Node head, int value,int x) {
        int index=1;

        if(head==null)
        {
            Node node = new Node(x);
            traverse(node);
            return node;
        }

        if(head.data==value)
        {

            Node node=new Node(x,head);
            traverse(node);
            return node;
        }

        Node temp=head;

        while (temp.next!=null)
        {
            if(temp.data==value)
            {
                Node node=new Node(x,temp.next);
                temp.next=node;
                break;
            }

            temp=temp.next;
            index++;
        }
        traverse(head);
        return head;
    }


    private static Node insertNode(Node head, int value, int position) {
        int index=1;

        if(head==null)
        {
            if(position==index)
            {
                traverse(head);
                return new Node(value);
            }
            else
            {
                return head;
            }
        }

        if(position==index)
        {

           Node node=new Node(value,head);
           traverse(node);
           return node;
        }

        Node temp=head;

        while (temp!=null)
        {
            if(index==position-1)
            {
                Node node=new Node(value,temp.next);
                temp.next=node;
                break;
            }

            temp=temp.next;
            index++;
        }
        traverse(head);
        return head;
    }


    static Node arrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);

        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    static void traverse(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}






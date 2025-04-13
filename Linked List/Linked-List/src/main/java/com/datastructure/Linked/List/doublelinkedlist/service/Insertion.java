package com.datastructure.Linked.List.doublelinkedlist.service;

import com.datastructure.Linked.List.doublelinkedlist.model.Node;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {12,5,8,7};

        Node head=convertArrayToDLL(arr);
       // traverse(head);
       // insertBeforeHead(head,9);
      //  insertAfterHead(head,7);
      //  insertBeforeTail(head, 6);
       // insertAfterTail(head,8);
       // insertBeforeKthElement(head, 4,7);

        insertBeforeGivenNode(head.next, 5);
        traverse(head);
    }

    static void insertBeforeGivenNode(Node node,int value)
    {
        // node never be null because if it is head we need to change head also
        Node previous=node.prev;
        Node newNode=new Node(value,node,previous);
        previous.next=newNode;
        node.prev=newNode;
    }

    static Node insertBeforeKthElement(Node head, int k, int value)
    {
        Node temp=head;
        if(k==1)
        {
            return insertBeforeHead(head,value);
        }

        int c=0;

        while (temp!=null)
        {
            c++;
            if(c==k)
            {
                break;
            }
           temp=temp.next;
        }

        if(temp==null)
        {
            return head;
        }
        Node prev=temp.prev;
        Node newNode=new Node(value,temp,prev);
        prev.next=newNode;
        temp.prev=newNode;
        traverse(head);
        return head;
    }

    static Node insertAfterTail(Node head,int value)
    {
        if(head.next==null)
        {
            return insertAfterHead(head, value);
        }
        Node tail=head;
        while (tail.next!=null)
        {
            tail=tail.next;
        }
        Node newHead=new Node(value,null,tail);
        tail.next=newHead;
        traverse(head);
        return head;
    }

    static Node insertBeforeTail(Node head,int value)
    {
        if(head.next==null)
        {
            return insertBeforeHead(head, value);
        }
        Node tail=head;
        while (tail.next!=null)
        {
            tail=tail.next;
        }
        Node previous=tail.prev;
        Node newHead=new Node(value,tail,previous);
        previous.next=newHead;
        tail.prev=newHead;
        traverse(head);
        return head;
    }
    static Node insertBeforeHead(Node head,int value)
    {
        Node newHead=new Node(value,head,null);
        head.prev=newHead;
        traverse(newHead);
        return newHead;
    }

    static Node insertAfterHead(Node head,int value)
    {
        Node front=head.next;
        Node newHead=new Node(value,front,head);
        head.next=newHead;
        front.prev=newHead;
        traverse(head);
        return head;
    }
    static void traverse(Node head)
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node convertArrayToDLL(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node previous=head;

        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i],null,previous);
            previous.next=temp;
            previous=temp;
        }

        //traverse(head);
        return head;
    }
}

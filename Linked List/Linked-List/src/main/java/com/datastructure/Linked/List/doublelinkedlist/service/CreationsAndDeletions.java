package com.datastructure.Linked.List.doublelinkedlist.service;

import com.datastructure.Linked.List.doublelinkedlist.model.Node;

public class CreationsAndDeletions {

    public static void main(String[] args) {
        int[] arr = {12,5,8,7};

        Node head=convertArrayToDLL(arr);
//        deleteHead(head);
//        deleteTail(head);
//        Node head1=deleteNode(head, 9);
//        traverse(head1);
        Node head1=deleteNodeByValue(head,5);
        traverse(head1);
    }

    static Node deleteNodeByValue(Node head,int value)
    {
        if(head==null)
        {
            return null;
        }
        Node kNode=head;
        while (kNode!=null)
        {

            if(kNode.data==value)
            {
                break;
            }
            kNode=kNode.next;
        }

        if(kNode==null)
        {
            // if k greater than length of linked list
            return head;
        }

        Node previous=kNode.prev;
        Node front=kNode.next;
        if(front==null&&previous==null)
        {
            return null;
        }
        else if(previous==null)
        {
            return deleteHead(head);
        }
        else if(front==null)
        {
            return deleteTail(head);
        }
        previous.next=front;
        front.prev=previous;
        kNode.prev=null;
        kNode.next=null;
        return head;
    }

    static Node deleteNode(Node head,int k)
    {
        if(head==null)
        {
           return null;
        }
        int count=0;
        Node kNode=head;
        while (kNode!=null)
        {
           count++;
           if(count==k)
           {
               break;
           }
           kNode=kNode.next;
        }

        if(kNode==null)
        {
            // if k greater than length of linked list
            return head;
        }

        Node previous=kNode.prev;
        Node front=kNode.next;
        if(front==null&&previous==null)
        {
            return null;
        }
        else if(previous==null)
        {
             return deleteHead(head);
        }
        else if(front==null)
        {
            return deleteTail(head);
        }
        previous.next=front;
        front.prev=previous;
        kNode.prev=null;
        kNode.next=null;
        return head;
    }
    static Node deleteTail(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        Node tail=head;
        while (tail.next!=null)
        {
            tail=tail.next;
        }
        Node newTail=tail.prev;
        newTail.next=null;
        tail.prev=null;
       //traverse(head);
        return head;
    }

    static Node deleteHead(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }

        Node previous=head;
        head=head.next;
        head.prev=null;
        previous.next=null;
       // traverse(head);
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

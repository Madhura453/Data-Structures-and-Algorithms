package com.datastructure.Linked.List.singleLinkedList;

import com.datastructure.Linked.List.singleLinkedList.model.Node;

public class DeletionOperations {

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 5, 7, 4,3};

//        System.out.println(arrayToLinkedList(arr));

        Node node = arrayToLinkedList(arr);

      // Node node1 = removeHead(node);

        //removeTail(node);

       // deleteNode(node,1);

        removeElement(node, 3);
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

    static boolean searchKey(int n, Node head, int key) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }


        return false;
    }


    static void traverse(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }


    public int getCount(Node head) {
        // code here

        Node temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;

            count++;
        }


        return count;
    }


    static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        traverse(head);
        return head;
    }

    static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return  null;
        }
        Node temp = head;
        while (temp.next.next!=null)
        {
            temp = temp.next;
        }

        temp.next=null;

        traverse(head);

        return head;
    }


   static Node deleteNode(Node head, int k) {


        int index =1;
        Node previous = null;
        Node temp=head;

        if(index==k)
        {
            head=head.next;
            traverse(head);
            return head;
        }

        while (temp!=null)
        {
            previous=temp;
            temp=temp.next;
            index++;
            if(index==k)
            {
                break;
            }

        }

        temp=temp.next;
        previous.next=temp;
        traverse(head);
        return head;
    }

    static Node removeElement(Node head, int value) {


        int index =1;
        Node previous = null;
        Node temp=head;

        if(temp.data==value)
        {
            head=head.next;
            traverse(head);
            return head;
        }

        while (temp!=null)
        {
            previous=temp;
            temp=temp.next;
            if(temp.data==value)
            {
                break;
            }

        }

        temp=temp.next;
        previous.next=temp;
        traverse(head);
        return head;
    }
}






package com.datastructure.Linked.List.alogirithims;

import com.datastructure.Linked.List.singleLinkedList.model.Node;

import java.util.Stack;

public class HareTortoiseAlogirithim {

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 5, 7, 4,3};
        Node head= arrayToLinkedList(arr);
       // System.out.println(c);
    }

    public int countNodesinLoop(Node head) {

        Node slow=head;

        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return findLength(slow,fast);
            }
        }


        return 0;
    }


    public int findLength(Node slow, Node fast)
    {
        int c=1;
        fast=fast.next;
        while(slow!=fast)
        {
            c++;
            fast=fast.next;
        }

        return c;
    }

    public static int findFirstNodeInLoop(Node head) {

        Node slow=head;

        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                slow=head;

                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }

                return slow.data;
            }
        }

        return -1;
    }
    public static boolean detectLoop(Node head) {
        // Add code here

        Node slow=head;

        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }


        return false;

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
}

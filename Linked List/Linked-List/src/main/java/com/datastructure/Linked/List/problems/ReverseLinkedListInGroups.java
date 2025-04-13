package com.datastructure.Linked.List.problems;


import com.datastructure.Linked.List.singleLinkedList.model.Node;

public class ReverseLinkedListInGroups {

    public static Node reverse(Node head, int k) {

        Node temp=head;
        Node previousLast=null;
        Node nextNode=null;

        while(temp!=null)
        {
            Node kthNode=getKthNode(temp,k);

            if(kthNode==null)
            {
                if(previousLast!=null)
                {
                    previousLast.next=temp;
                }
                break;
            }
            nextNode=kthNode.next;
            kthNode.next=null;

            Node newHead=revereseLinkedList(temp);

            if(temp==head)
            {
                head=kthNode;
            }
            else
            {
                previousLast.next=kthNode;
            }

            previousLast=temp;
            temp=nextNode;
        }

        return head;

    }


    public static Node getKthNode(Node temp,int k)
    {

        while(temp!=null&&k>1)
        {
            k--;
            if(temp.next==null)
            {
                return temp;
            }
            temp=temp.next;
        }

        return temp;
    }

    public static Node revereseLinkedList(Node head)
    {
        Node temp=head;
        Node previous=null;

        while(temp!=null)
        {
            Node front=temp.next;
            temp.next=previous;
            previous=temp;
            temp=front;
        }

        return previous;
    }
}

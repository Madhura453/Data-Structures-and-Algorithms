package com.datastructure.Linked.List.singleLinkedList;

import com.datastructure.Linked.List.singleLinkedList.model.Node;

public class LinkedListCreation {


    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,8};

        Node node=new Node(5);

        System.out.println(node.data);

    }


    public int celebrity(int mat[][]) {

        int c=0;

        int m=mat[0].length;

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(mat[i][j]==0 && i!=j)
               {
                   c++;
               }
            }

            if(c==(m-1))
            {
                return i;
            }
        }


            return -1;
        // code here
    }

}


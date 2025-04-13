package com.trees.dfsTraversal;

import com.trees.model.Node;

import java.util.ArrayList;

public class PreOrderTraversal {
}


class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.

    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> q=new ArrayList<>();

        preorderTraversal(root,q);
        return q;
    }

    static void preorderTraversal(Node root,ArrayList<Integer> q)
    {

        if(root==null)
        {
            return;
        }

        q.add(root.data);
        preorderTraversal(root.left,q);
        preorderTraversal(root.right,q);
    }

}
package com.trees.dfsTraversal;

import com.trees.model.Node;

import java.util.ArrayList;

public class InOrderTraversal {

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> w=new ArrayList<>();
        inOrderTraversal(root,w);
        return w;
    }

    void inOrderTraversal(Node root, ArrayList<Integer> w) {
        if(root==null)
        {
            return;
        }
        inOrderTraversal(root.left,w);
        w.add(root.data);
        inOrderTraversal(root.right,w);
    }
}

package com.trees.dfsTraversal;

import com.trees.model.Node;

import java.util.ArrayList;

public class PostOrderTraversal {

    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> w=new ArrayList<>();
        postOrderTraversal(root,w);
        return w;
    }

    void postOrderTraversal(Node root,ArrayList<Integer> w)
    {
        if(root==null)
        {
            return;
        }
        postOrderTraversal(root.left,w);

        postOrderTraversal(root.right,w);
        w.add(root.data);
    }
}

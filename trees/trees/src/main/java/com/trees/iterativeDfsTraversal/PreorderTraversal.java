package com.trees.iterativeDfsTraversal;

import com.trees.model.Node;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {

    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> preOrder=new ArrayList<>();
        if(root==null)
        {
            return preOrder;
        }
        Stack<Node> stack=new Stack<>();

        stack.push(root);

        while(!stack.isEmpty())
        {
            root=stack.pop();
            preOrder.add(root.data);
            if(root.right!=null)
            {
                stack.push(root.right);
            }
            if(root.left!=null)
            {
                stack.push(root.left);
            }
        }

        return preOrder;
    }
}

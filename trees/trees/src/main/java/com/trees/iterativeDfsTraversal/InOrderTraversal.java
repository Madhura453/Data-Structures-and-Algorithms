package com.trees.iterativeDfsTraversal;

import com.trees.model.Node;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {

    ArrayList<Integer> inOrder(Node root)
    {
        // Code

        ArrayList<Integer> inOrder=new ArrayList<>();

        Stack<Node> stack=new Stack<>();
        Node node=root;
        while(true)
        {
            if(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
            else
            {
                if(stack.isEmpty())
                {
                    break;
                }
                node=stack.pop();
                inOrder.add(node.data);
                node=node.right;
            }

        }

        return inOrder;

    }
}

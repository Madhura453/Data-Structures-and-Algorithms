package com.trees.iterativeDfsTraversal;

import com.trees.model.Node;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {

    ArrayList<Integer> postOrder(Node node) {

        ArrayList<Integer> postOrder=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        Stack<Node> orderStack=new Stack<>();

        stack.push(node);
        while(!stack.isEmpty())
        {
            node=stack.pop();
            orderStack.push(node);
            if(node.left!=null)
            {
                stack.push(node.left);
            }
            if(node.right!=null)
            {
                stack.push(node.right);
            }

        }

        while(!orderStack.isEmpty())
        {
            postOrder.add(orderStack.pop().data);
        }

        return postOrder;
    }
}

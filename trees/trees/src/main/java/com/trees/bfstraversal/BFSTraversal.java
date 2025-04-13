package com.trees.bfstraversal;

import com.trees.model.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> m=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();

        if(root==null)
        {
            return m;
        }

        q.offer(root);

        while(!q.isEmpty())
        {
            int levelSize=q.size();

            List<Integer> subList=new ArrayList<>();

            for(int i=0;i<levelSize;i++)
            {
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);
                }

                if(q.peek().right!=null)
                {
                    q.offer(q.peek().right);
                }
                subList.add(q.poll().data);
            }

            m.add(subList);
        }
        return m;
    }
}

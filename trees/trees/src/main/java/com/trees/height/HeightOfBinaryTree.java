package com.trees.height;

import com.trees.model.Node;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {

    int height(Node node)
    {
        int maxheight=0;

        if(node==null)
        {
            return 0;
        }

        int c=1;
        Queue<Node> queue=new LinkedList<>();

        queue.offer(node);

        while(!queue.isEmpty())
        {
            int size=queue.size();

            for(int i=0;i<size;i++)
            {
                Node p=queue.poll();

                if(p.left==null || p.right==null)
                {
                    maxheight=Math.max(maxheight,c);
                }

                if(p.left!=null)
                {
                    queue.offer(p.left);
                }
                if(p.right!=null)
                {
                    queue.offer(p.right);
                }
            }


            c++;
        }

        return maxheight;
    }



}

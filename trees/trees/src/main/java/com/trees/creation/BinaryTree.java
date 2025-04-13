package com.trees.creation;

import com.trees.model.Node;

public class BinaryTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);

        root.right=right;
        root.left=left;
        root.right.left=new Node(5);

    }
}

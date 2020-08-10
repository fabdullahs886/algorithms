package com.binarytree;

//You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
//
//        struct Node {
//        int val;
//        Node *left;
//        Node *right;
//        Node *next;
//        }
//        Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//        Initially, all next pointers are set to NULL.
//
//        Follow up:
//
//        You may only use constant extra space.
//        Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.
//
//        Example 1:
//
//        Input: root = [1,2,3,4,5,6,7]
//        Output: [1,#,2,3,#,4,5,6,7,#]
//        Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
//
//        Constraints:
//
//        The number of nodes in the given tree is less than 4096.
//        -1000 <= node.val <= 1000
//
//https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/994/

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    private Node connect(Node root) {
        if (root == null) return null;

        Node node = recursive(root);
        System.out.println("Recursive output : "  + node );

        node = iterative(root);
        System.out.println("Iterative output : "  + node );

        return node;
    }

    private Node iterative(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node next = null;
            for(int i = 0; i < size; i++){
                Node node = queue.remove();
                node.next = next;
                next = node;
                if(node.right != null){
                    queue.add(node.right);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
            }
        }
        return root;
    }

    private Node recursive(Node root){
        if( root.left == null) return root;
        root.left.next = root.right;

        if(root.next != null && root.next.left != null){
            root.right.next  = root.next.left;
        }


        root.left = connect(root.left);
        root.right = connect(root.right);
        return root;
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }

        public  String toString(){
            return "TreeNode[ val: " + val + " , Left: " + left + " , Right: " + right + " , Next: " + next +"]";
        }
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode obj = new PopulatingNextRightPointersInEachNode();
        Node node = null;

        node = new Node(1,new Node(2), new Node(3),null);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.left = new Node(7);
        obj.connect(node);

    }
}

package com.binarytree;

//Given a binary tree
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
//
//
//        Follow up:
//
//        You may only use constant extra space.
//        Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.
//
//
//        Example 1:
//
//
//
//        Input: root = [1,2,3,4,5,null,7]
//        Output: [1,#,2,3,#,4,5,7,#]
//        Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
//
//
//        Constraints:
//
//        The number of nodes in the given tree is less than 6000.
//        -100 <= node.val <= 100

import java.util.HashMap;
import java.util.Map;

public class PopulatingNextRightPointersInEachNode2 {
    private Node connect(Node root) {

        form(root, new HashMap<>(), 0);
        return root;
//        if(root == null) return null;
//
//        if(root.left != null && root.right != null)
//            root.left.next = root.right;
//
//        if( root.next != null && root.next.left != null)
//            root.right.next = root.next.left;
//        else if(root.next != null &&  root.next.left == null && root.next.right != null && root.right != null)
//            root.right.next = root.next.right;
////        else
////            root.right.next = null;
//
//        connect(root.left);
//        connect(root.right);
//
//        return root;
    }

    public void form(Node root, Map<Integer, Node> map, int level) {
        if(root == null) return;

        root.next = map.getOrDefault(level, null);
        map.put(level, root);

        form(root.right, map, level + 1);
        form(root.left, map, level + 1);
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
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode2 obj = new PopulatingNextRightPointersInEachNode2();
        Node node = null;

        node = new Node(1, new Node(2), new Node(3),null);
        node.left.left = new Node(4);
        node.right.right = new Node(5);
        obj.connect(node);

        node = new Node(1, new Node(2), new Node(3), null);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.right = new Node(7);

        obj.connect(node);

    }

}



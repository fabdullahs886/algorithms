package com.binarytree;

//Given a binary tree, return the preorder traversal of its nodes' values.
//
//        Example:
//
//        Input: [1,null,2,3]
//        1
//          \
//           2
//          /
//        3
//
//        Output: [1,2,3]
//        Follow up: Recursive solution is trivial, could you do it iteratively?

import java.util.*;

public class BinaryTreePreorderTraversal {

    List<Integer> result = new ArrayList<>();
    private List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return null;

        result.add(root.val);

        if(root.left != null)
            preorderTraversal(root.left);
        if(root.right != null)
            preorderTraversal(root.right);

        return result;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node = null;
        BinaryTreePreorderTraversal obj = new BinaryTreePreorderTraversal();

        node = new TreeNode(3,new TreeNode(1),new TreeNode(2));
        System.out.println(obj.preorderTraversal(node)); // [3,1,2]

        obj.result.clear();

        node = new TreeNode(1,null,new TreeNode(2));
        node.right.left = new TreeNode(3);
        System.out.println(obj.preorderTraversal(node)); // [1,2,3]



    }
}

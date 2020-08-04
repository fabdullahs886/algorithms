package com.binarytree;

import java.util.List;

public class BinaryTreePreorderTraversal {
    private List<Integer> preorderTraversal(TreeNode root) {
        return null;
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

    }
}

package com.binarytree;

//Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//        Note: A leaf is a node with no children.
//
//        Example:
//
//        Given binary tree [3,9,20,null,null,15,7],
//
//           3
//         /  \
//        9   20
//           /  \
//          15   7
//        return its depth = 3.

public class MaximumDepthOfBinaryTree {

    private int answer;
    private int maxDepth(TreeNode root) {
        if( root == null) return 0;
        int depth = 1;
        get_depth(root,depth);
        System.out.println("Depth is " + answer);
        return answer;
    }

    private void get_depth(TreeNode node, int depth){
        if(node.left == null && node.right  == null)
            answer = Math.max(answer,depth);
        if(node.left != null)
            get_depth(node.left, depth + 1);
        if(node.right != null)
            get_depth(node.right, depth + 1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node = null;
        MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();

        node = new TreeNode(3,new TreeNode(9),new TreeNode(20));
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        obj.maxDepth(node); //3


    }
}

package com.problems.easy;

//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//        For example:
//        Given binary tree [3,9,20,null,null,15,7],
//        3
//        / \
//        9   20
//           /  \
//          15   7
//        return its bottom-up level order traversal as:
//        [
//        [15,7],
//        [9,20],
//        [3]
//        ]


import java.util.*;

public class BinaryTreeLevelOrderTraversalII {

    private List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List l = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            result.add(0,l);
        }
        System.out.println(result);
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
        BinaryTreeLevelOrderTraversalII obj = new BinaryTreeLevelOrderTraversalII();

        node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right =  new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        obj.levelOrderBottom(node);     // [[15,7],[9,20],[3]]

    }
}

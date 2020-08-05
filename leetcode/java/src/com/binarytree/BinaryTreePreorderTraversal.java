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
    private List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        recursive(root,result);
        System.out.println("Recursive output : "  + result );

        result.clear();

        iterative(root,result);
        System.out.println("Iterative output : "  + result );

        return result;
    }

    private void recursive(TreeNode node, List<Integer> result){
        if(node == null) return;
        result.add(node.val);

        if(node.left != null)
            recursive(node.left,result);
        if(node.right != null)
            recursive(node.right,result);
    }

    private void iterative(TreeNode node, List<Integer> result){
        if ( node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode e = stack.pop();
            if(e != null) {
                result.add(e.val);
                stack.push(e.right);
                stack.push(e.left);
            }
        }
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
        obj.preorderTraversal(node); // [3,1,2]

        node = new TreeNode(1,null,new TreeNode(2));
        node.right.left = new TreeNode(3);
        obj.preorderTraversal(node); // [1,2,3]



    }
}

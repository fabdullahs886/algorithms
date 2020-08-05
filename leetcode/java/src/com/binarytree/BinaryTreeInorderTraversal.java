package com.binarytree;

//Given a binary tree, return the inorder traversal of its nodes' values.
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
//        Output: [1,3,2]
//        Follow up: Recursive solution is trivial, could you do it iteratively?

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursive(root, result);
        System.out.println("Recursive output : "  + result );

        result.clear();

        iterative(root, result);
        System.out.println("Iterative output : "  + result );

        return result;
    }

    private void recursive(TreeNode node, List<Integer> result){
        if(node == null) return;

        if(node.left != null)
            recursive(node.left,result);

        result.add(node.val);

        if(node.right != null)
            recursive(node.right,result);
    }

    private void iterative(TreeNode node, List<Integer> result){
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || node != null){
           if(node != null){
               stack.push(node);
               node = node.left;
           }else{
               node = stack.pop();
               result.add(node.val);
               node = node.right;
           }
        }
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
        BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();

        node = new TreeNode(1,null,new TreeNode(2));
        node.right.left = new TreeNode(3);
        obj.inorderTraversal(node); // [1,3,2]

    }
}

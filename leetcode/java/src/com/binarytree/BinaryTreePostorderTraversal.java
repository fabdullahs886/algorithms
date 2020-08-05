package com.binarytree;

//Given a binary tree, return the postorder traversal of its nodes' values.
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
//        Output: [3,2,1]
//        Follow up: Recursive solution is trivial, could you do it iteratively?

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    private List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        recursive(root, result);
        System.out.println("Recursive output : "  + result );

        result.clear();

        iterative(root,result);
        System.out.println("Iterative output : "  + result );

        return result;
    }

    private void recursive(TreeNode node, List<Integer> result){
        if(node == null) return;

        if( node.left != null)
            recursive(node.left,result);
        if(node.right != null)
            recursive(node.right,result);

        result.add(node.val);
    }

    private void iterative(TreeNode node, List<Integer> result){
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> out = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            node = stack.pop();
            out.push(node.val);

            if(node.left != null)
                stack.push(node.left);

            if(node.right != null)
                stack.push(node.right);
        }

        while(!out.isEmpty()){
            result.add(out.pop());
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
        BinaryTreePostorderTraversal obj = new BinaryTreePostorderTraversal();

        node = new TreeNode(1,null,new TreeNode(2));
        node.right.left = new TreeNode(3);
        obj.postorderTraversal(node); // [3,2,1]

        node = new TreeNode();
        obj.postorderTraversal(node); // []

    }

}

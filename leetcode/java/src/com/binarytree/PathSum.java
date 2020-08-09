package com.binarytree;

//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//        Note: A leaf is a node with no children.
//
//        Example:
//
//        Given the below binary tree and sum = 22,
//
//           5
//          / \
//         4   8
//        /   / \
//       11  13  4
//      /  \      \
//     7    2      1
//        return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

import com.sun.source.tree.Tree;

import java.util.Stack;

public class PathSum {

    private boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        boolean result = recursive(root, sum,0);
        System.out.println("Recursive output : "  + result );

        result = iterative(root, sum);
        System.out.println("Iterative output : "  + result );

        return result;
    }

    private boolean iterative(TreeNode node, int sum){
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> num_stack = new Stack<>();

        stack.add(node);
        num_stack.add(sum - node.val);

        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            int cur_sum = num_stack.pop();

            if(cur.left == null && cur.right == null && cur_sum == 0)
                return true;

            if(cur.left != null){
                stack.add(cur.left);
                num_stack.add(cur_sum - cur.left.val);
            }

            if(cur.right != null){
                stack.add(cur.right);
                num_stack.add(cur_sum - cur.right.val);
            }
        }
        return  false;

    }

    private boolean recursive(TreeNode node, int sum, int total){
        if ( node ==  null) return false;

        if(node.left == null && node.right == null && total + node.val == sum)
            return true;
        else
            return recursive(node.left,sum, total + node.val) || recursive(node.right,sum, total + node.val) ;
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
        PathSum obj = new PathSum();

        node = new TreeNode(5,new TreeNode(4), new TreeNode(8));
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(1);
        obj.hasPathSum(node, 22);   // ans: true because 5->4->11->2 = 22

        node = new TreeNode(-2, null, new TreeNode(-3));
        obj.hasPathSum(node, -5);   // ans: true

        node = new TreeNode();
        obj.hasPathSum(node, 1);   // ans: false


        node = new TreeNode(1);
        obj.hasPathSum(node, 1);   // ans: true

    }
}

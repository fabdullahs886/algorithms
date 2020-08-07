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

public class PathSum {

    private boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        boolean result = hasPathSum(root, sum,0);

        return result;
    }

    private boolean hasPathSum(TreeNode node, int sum, int total){
        if ( node ==  null) return false;

        if(node.left == null && node.right == null && total + node.val == sum)
            return true;
        else
            return hasPathSum(node.left,sum, total + node.val) || hasPathSum(node.right,sum, total + node.val) ;
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

        node = new TreeNode(-2, null, new TreeNode(-3));
        System.out.println("Result : " + obj.hasPathSum(node, -5));   // ans: true


        node = new TreeNode(5,new TreeNode(4), new TreeNode(8));
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(1);
        System.out.println("Result : " + obj.hasPathSum(node, 22));   // ans: true because 5->4->11->2 = 22

        node = new TreeNode();
        System.out.println("Result : " + obj.hasPathSum(node, 1));   // ans: false


        node = new TreeNode(1);
        System.out.println("Result : " + obj.hasPathSum(node, 1));   // ans: true

    }
}

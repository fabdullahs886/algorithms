package com.problems.easy;

//Given a binary tree, determine if it is height-balanced.
//
//        For this problem, a height-balanced binary tree is defined as:
//
//        a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
//
//             3
//           /  \
//          9    20
//              /  \
//             15   7
//        Input: root = [3,9,20,null,null,15,7]
//        Output: true
//
//            1
//           /  \
//          2    2
//         / \
//        3   3
//       / \
//      4   4
//        Input: root = [1,2,2,3,3,null,null,4,4]
//        Output: false
//
//        Input: root = []
//        Output: true
//
//        Constraints:
//
//        The number of nodes in the tree is in the range [0, 5000].
//        -104 <= Node.val <= 104

public class BalancedBinaryTree {

    private boolean isBalanced(TreeNode root) {
        return isBalancedTree(root) != -1;
    }

    private int isBalancedTree(TreeNode node){
        if(node == null)
            return 0;

        int left = isBalancedTree(node.left);
        int right = isBalancedTree(node.right);

        if(left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;

        return Math.max(left,right) + 1;
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
        TreeNode node  = null;
        BalancedBinaryTree obj = new BalancedBinaryTree();

        node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(obj.isBalanced(node));   // true

        node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        node.left.left = new TreeNode(3);
        node.left.left.right = new TreeNode(4);
        node.left.left.left = new TreeNode(4);
        System.out.println(obj.isBalanced(node));   //false

        node = new TreeNode();
        System.out.println(obj.isBalanced(node));   //true
    }

}

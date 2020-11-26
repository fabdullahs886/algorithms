package com.problems.easy;

//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
//
//        For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//
//        Example:
//
//        Given the sorted array: [-10,-3,0,5,9],
//
//        One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
//
//        0
//       /  \
//      -3   9
//      /    /
//     -10   5

public class ConvertSortedArrayToBinarySearchTree {

    private TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0 ,nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int low, int high){
        if(low > high)
            return null;

        int mid = low + (high - low)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, low, mid - 1);
        root.right = buildTree(nums, mid + 1, high);
        return root;
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
        ConvertSortedArrayToBinarySearchTree obj = new ConvertSortedArrayToBinarySearchTree();
        System.out.println(obj.sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }
}

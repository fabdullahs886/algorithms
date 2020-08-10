package com.binarytree;

//Given preorder and inorder traversal of a tree, construct the binary tree.
//
//        Note:
//        You may assume that duplicates do not exist in the tree.
//
//        For example, given
//
//        preorder = [3,9,20,15,7]
//        inorder = [9,3,15,20,7]
//        Return the following binary tree:
//
//         3
//        / \
//       9   20
//          /  \
//         15   7

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    int index = 0;
    private TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map  =new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        TreeNode node = recursiveWithMap(preorder, inorder, map,0,inorder.length - 1);
        System.out.println("Recursive output : "  + node );

        return node;
    }

    private TreeNode recursiveWithMap(int[] preorder, int[] inorder, Map<Integer,Integer> map,int start, int end){
        if( start > end) return null;

        TreeNode root = new TreeNode(preorder[index++]);
        int pos = map.get(root.val);

        root.left  = recursiveWithMap(preorder, inorder,  map,start, pos - 1);
        root.right = recursiveWithMap(preorder, inorder, map, pos+1, end);

        return root;
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
        public  String toString(){
            return "TreeNode[ val: " + val + " , Left: " + left + " , Right: " + right + "]";
        }
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal obj = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        obj.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
    }

}

package com.binarytree;

//Given inorder and postorder traversal of a tree, construct the binary tree.
//
//        Note:
//        You may assume that duplicates do not exist in the tree.
//
//        For example, given
//
//        inorder = [9,3,15,20,7]
//        postorder = [9,15,7,20,3]
//        Return the following binary tree:
//
//         3
//        / \
//       9   20
//          /  \
//         15   7
//https://www.youtube.com/watch?v=0r_cx1c8Z1A

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    int index;
    private TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null ) return null;
        int len = inorder.length;
        TreeNode node = recursive(inorder,postorder,0,len - 1,0,len - 1);
        System.out.println("Recursive output : "  + node );

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        index = postorder.length-1;

        node = recursiveWithMap(inorder,postorder, map, 0, postorder.length -1);
        System.out.println("Recursive output2 : "  + node );
        return node;
    }

    private TreeNode recursiveWithMap(int[] inorder, int[] postorder, Map<Integer, Integer> map, int start, int end){
        if( start > end) return null;

        TreeNode root = new TreeNode(postorder[index--]);
        int pos = map.get(root.val);

        root.right = recursiveWithMap(inorder,postorder,map, pos + 1, end);
        root.left = recursiveWithMap(inorder,postorder,map,start, pos - 1);
        return root;

    }

    private TreeNode recursive(int[] inorder, int[] postorder,int i1, int i2 , int p1, int p2){
        if ( i1 > i2 || p1 > p2) return null;

        TreeNode root = new TreeNode(postorder[p2]);

        int rootIndex  = i1;
        for(; rootIndex <= i2; rootIndex++){
            if(inorder[rootIndex] == postorder[p2]){
                break;
            }
        }
        System.out.println("rootIndex : " + rootIndex);

        int leftTreeSize = rootIndex - i1;
        int rightTreeSize = i2 - rootIndex;

        root.left = recursive(inorder,postorder,i1, rootIndex - 1, p1, p1 + leftTreeSize - 1);
        root.right = recursive(inorder,postorder,rootIndex + 1, i2, p2 - rightTreeSize, p2 - 1);

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
        ConstructBinaryTreeFromInorderAndPostorderTraversal obj = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        obj.buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3});
    }
}

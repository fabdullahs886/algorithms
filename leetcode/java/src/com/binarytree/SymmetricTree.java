package com.binarytree;

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//         1
//        / \
//       2    2
//      / \  / \
//     3  4  4  3
//
//
//        But the following [1,2,2,null,3,null,3] is not:
//
//         1
//        / \
//       2   2
//        \   \
//         3   3
//
//
//        Follow up: Solve it both recursively and iteratively

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {

    private  boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        boolean result = isSymmetric(root.left, root.right);
        System.out.println("Recursive output : "  + result );

        result = iterative(root);
        System.out.println("Iterative output : "  + result );

        return result;
    }

    private boolean iterative(TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        q.add(node);
        while(!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null) return true;
            if(t1 == null || t2 == null) return false;
            if(t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

    private boolean isSymmetric(TreeNode left, TreeNode right){
        if( left == null || right == null)
            return left == right;

        if(left.val != right.val)
            return false;

        return isSymmetric(left.left,right.right) && isSymmetric(left.right, right.left);

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
        SymmetricTree obj = new SymmetricTree();

        node = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(3);
        obj.isSymmetric(node); // true

        node = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        node.right.right = new TreeNode(3);
        node.left.right = new TreeNode(3);
        obj.isSymmetric(node); // false
    }

}

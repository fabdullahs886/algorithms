package com.problems.easy;

//  Given two binary trees, write a function to check if they are the same or not.
//
//        Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
//
//        Example 1:
//
//        Input:     1         1
//        / \       / \
//        2   3     2   3
//
//        [1,2,3],   [1,2,3]
//
//        Output: true
//        Example 2:
//
//        Input:     1         1
//        /           \
//        2             2
//
//        [1,2],     [1,null,2]
//
//        Output: false
//        Example 3:
//
//        Input:     1         1
//        / \       / \
//        2   1     1   2
//
//        [1,2,1],   [1,1,2]
//
//        Output: false


public class SameTree {

    private boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if( p == null || q == null) return false;

        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

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
        SameTree.TreeNode p = null;
        SameTree.TreeNode q = null;
        SameTree obj = new SameTree();

        p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(obj.isSameTree(p,q));

        p = new TreeNode(1);
        p.left = new TreeNode(2);
        q = new TreeNode(1);
        q.right = new TreeNode(2);
        System.out.println(obj.isSameTree(p,q));

        p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        System.out.println(obj.isSameTree(p,q));
    }

}

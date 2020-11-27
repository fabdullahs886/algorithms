package com.problems.easy;

//    Given a binary tree, find its minimum depth.
//
//    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
//    Note: A leaf is a node with no children.
//
//    Example 1:
//        3
//       / \
//      9   20
//         /  \
//        15   7
//    Input: root = [3,9,20,null,null,15,7]
//    Output: 2
//
//    Example 2:
//            2
//             \
//              3
//               \
//                4
//                 \
//                  5
//                   \
//                    6
//    Input: root = [2,null,3,null,4,null,5,null,6]
//    Output: 5

//    Constraints:
//
//        The number of nodes in the tree is in the range [0, 105].
//        -1000 <= Node.val <= 1000

import com.binarytree.MaximumDepthOfBinaryTree;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {

    private int minDepth(TreeNode root) {
        if ( root == null)
            return 0;

//        return get_depth_dfs(root);
        return get_depth_bfs(root);
    }

    private int get_depth_dfs(TreeNode node){
        if( node.left == null && node.right == null)
            return 1;

        int min = Integer.MAX_VALUE;
        if(node.left != null){
            min = Math.min(get_depth_dfs(node.left),min);
        }
        if(node.right != null){
            min = Math.min(get_depth_dfs(node.right), min);
        }
        return min+1;
    }

    private int get_depth_bfs(TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int depth = 1;
        while (!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode tn = q.poll();
                if(tn.left == null && tn.right == null)
                    return depth;
                if(tn.left != null)
                    q.add(tn.left);
                if(tn.right != null)
                    q.add(tn.right);
            }
            depth++;
        }
        return depth;
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
        MinimumDepthOfBinaryTree obj = new MinimumDepthOfBinaryTree();
        TreeNode node;

        node = new TreeNode(1);
        System.out.println(obj.minDepth(node)); // 1

        System.out.println(obj.minDepth(null)); // 0

        node = new TreeNode(1);
        node.left = new TreeNode(2);
        System.out.println(obj.minDepth(node)); // 2

        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        System.out.println(obj.minDepth(node)); // 2

        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        System.out.println(obj.minDepth(node)); // 2


        node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.left = new TreeNode(7);
        System.out.println(obj.minDepth(node)); // 2

        node = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(5);
        node.right.right.right.right = new TreeNode(6);
        System.out.println(obj.minDepth(node)); // 5

    }
}

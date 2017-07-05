//104. Maximum Depth of Binary Tree
// Given a binary tree, find its maximum depth.
//
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

//Runtime: 0 ms
//Iterative approach DFS and BFS
//https://discuss.leetcode.com/topic/33826/two-java-iterative-solution-dfs-and-bfs

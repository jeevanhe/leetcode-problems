//100. Same Tree
// Given two binary trees, write a function to check if they are equal or not.
//
// Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if(p == null || q == null)
            return false;
        boolean t1 = isSameTree(p.left, q.left);
        boolean t2 = isSameTree(p.right, q.right);
        //Pointers and vale validation
        if(p.val == q.val && t1 && t2)
            return true;
        else
            return false;
    }
}
//Runtime: 0 ms

//Concise Solution:
//https://discuss.leetcode.com/topic/4737/five-line-java-solution-with-recursion/11
public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}

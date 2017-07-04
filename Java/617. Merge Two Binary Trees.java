//617. Merge Two Binary Trees

// Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
//
// You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
//
// Example 1:
// Input:
// 	Tree 1                     Tree 2
//           1                         2
//          / \                       / \
//         3   2                     1   3
//        /                           \   \
//       5                             4   7
// Output:
// Merged tree:
// 	     3
// 	    / \
// 	   4   5
// 	  / \   \
// 	 5   4   7
// Note: The merging process must start from the root nodes of both trees.

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        int num = 0;
        if(t1 == null && t2 == null)
            return null;
        else if (t1 != null && t2 != null)
            num = t1.val + t2.val;
        else if(t1==null && t2 != null)
            num = t2.val;
        else if (t1 != null && t2 == null)
            num = t1.val;
        TreeNode temp = new TreeNode(num);
        temp.left = mergeTrees(t1 == null ? null :t1.left, t2 == null ? null : t2.left);
        temp.right = mergeTrees(t1 == null ? null: t1.right, t2 == null ? null : t2.right);

        return temp;

    }
}

//Runtime: 14 ms
//Solution: https://leetcode.com/articles/merge-two-binary-trees/
// Complexity Analysis
//
// Time complexity : O(m). A total of mm nodes need to be traversed. Here, mm represents the minimum number of nodes from the two given trees.
//
// Space complexity : O(m). The depth of the recursion tree can go upto mm in the case of a skewed tree. In average case, depth will be O(logm)

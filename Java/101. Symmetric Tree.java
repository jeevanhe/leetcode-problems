//101. Symmetric Tree
// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
// For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//     1
//    / \
//   2   2
//  / \ / \
// 3  4 4  3
// But the following [1,2,2,null,3,null,3] is not:
//     1
//    / \
//   2   2
//    \   \
//    3    3
// Note:
// Bonus points if you could solve it both recursively and iteratively.

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSubSymmetric(root.left, root.right);

    }
    public boolean isSubSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;
        else
            return isSubSymmetric(left.left,right.right) && isSubSymmetric(left.right, right.left);
    }
}

//Runtime: 1 ms
//iterative : https://discuss.leetcode.com/topic/4332/my-c-accepted-code-in-16ms-with-iteration-solution

//https://discuss.leetcode.com/topic/5941/recursive-and-non-recursive-solutions-in-java

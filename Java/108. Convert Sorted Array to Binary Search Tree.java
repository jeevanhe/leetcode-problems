//108. Convert Sorted Array to Binary Search Tree
// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

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
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return null;
        int low = 0;
        int high = len-1;
        return contructBST(nums, low, high);
    }

    public TreeNode contructBST(int [] nums, int l, int h) {
        if(l>h)
            return null;
        int mid = l + (h - l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = contructBST(nums, l, mid-1);
        root.right = contructBST(nums, mid+1, h);
        return root;
    }
}

// Time O(logn)
//space o(n)
//https://discuss.leetcode.com/topic/3158/my-accepted-java-solution/2

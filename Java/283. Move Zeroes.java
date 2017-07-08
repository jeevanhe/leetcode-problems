//283. Move Zeroes
// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
// For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
//
// Note:
// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.

public class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int j = 0;
        for(int i=0 ; i<len; i++) {
            if(nums[i]!=0)
                nums[j++] = nums[i];
        }
        while(j<len)
            nums[j++] = 0;
    }
}
// Space Complexity : O(1). Only constant space is used.
// Time Complexity: O(n)
//Runtime: 1 ms
//Editoial Solution: https://leetcode.com/articles/move-zeroes/

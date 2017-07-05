//136. Single Number
// Given an array of integers, every element appears twice except for one. Find that single one.
//
// Note:
// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}

//Runtime: 1 ms

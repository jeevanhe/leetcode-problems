//70. Climbing Stairs
// You are climbing a stair case. It takes n steps to reach to the top.
//
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
// Note: Given n will be a positive integer.

public class Solution {
    public int climbStairs(int n) {
        int n1=1, n2=2;
        if(n == n1)
            return n1;
        if(n == n2)
            return n2;
        int sum = 0;
        for(int i=2; i<n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }
}

//Runtime: 0 ms
//https://discuss.leetcode.com/topic/5371/basically-it-s-a-fibonacci/4

//Editorial Solution https://leetcode.com/articles/climbing-stairs/

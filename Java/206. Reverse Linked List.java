//206. Reverse Linked List
// Reverse a singly linked list.
//
// click to show more hints.
//
// Hint:
// A linked list can be reversed either iteratively or recursively. Could you implement both?

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 //iterative Solution

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;

        ListNode prev = null,next = null;
        ListNode cur = head;
        while(cur!=null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

//Runtime: 0 ms

//Editorial Solution:
//https://leetcode.com/articles/reverse-linked-list/
//Others : https://leetcode.com/problems/reverse-linked-list/#/solutions

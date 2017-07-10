//21. Merge Two Sorted Lists
// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        ListNode f1 = l1;
        ListNode f2 = l2;
        while(f1!=null && f2!=null) {
            if(f1.val <= f2.val) {
                head.next = f1;
                f1 = f1.next;
            } else {
                head.next = f2;
                f2 = f2.next;
            }
            head = head.next;
        }
        while(f1!=null) {
            head.next = f1;
            f1 = f1.next;
            head = head.next;
        }
        while(f2!=null) {
            head.next = f2;
            f2 = f2.next;
            head = head.next;
        }
        return dummy.next;
    }
}

//Runtime: 15 ms

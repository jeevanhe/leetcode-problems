//21. Merge Two Sorted Lists
// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    //Recursion
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {

        // base cases
        if (l1==NULL)
            return l2;
        if (l2==NULL)
            return l1;

        // Merging
        ListNode* result = NULL;
        if (l1->val <= l2->val) {
            result = l1;
            result->next = mergeTwoLists(l1->next, l2);
        } else {
            result = l2;
            result->next = mergeTwoLists(l1, l2->next);
        }
        return result;
    }
};

//Runtime: 12 ms
//https://discuss.leetcode.com/topic/2513/a-recursive-solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;         // Base case: list1 is empty
        if (list2 == null) return list1;         // Base case: list2 is empty

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2); // Recur with list1.next
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next); // Recur with list2.next
            return list2;
        }
    }
}
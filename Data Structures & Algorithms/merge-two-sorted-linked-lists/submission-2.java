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
        //iterative

        ListNode dummy = new ListNode();
        ListNode node = dummy; 

        while (list1 !=null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 == null) {
            node.next = list2;
        } else {
            node.next = list1;
        }

        return dummy.next;

        //recursive
        // if (list1 == null) {
        //     return list2;
        // } else if (list2 == null) {
        //     return list1;
        // }
        // ListNode head;
        // if (list1.val < list2.val) {
        //     head = list1;
        //     head.next = mergeTwoLists(list1.next, list2);
        // } else {
        //     head = list2;
        //     head.next = mergeTwoLists(list1, list2.next);
        // }

        // return head;
    }
}
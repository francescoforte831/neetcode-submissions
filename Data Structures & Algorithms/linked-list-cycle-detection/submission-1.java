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
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p1 = head, p2 = head.next;
        
        while(p1 != p2) {
            if (p2 == null || p2.next == null) {
                return false;
            } else {
                p2 = p2.next.next;
                p1 = p1.next;
            }
        }

        return true;

    }
}

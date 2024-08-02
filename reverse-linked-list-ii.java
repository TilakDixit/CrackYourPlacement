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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // Create a dummy node to simplify edge cases where reversing starts at the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node just before the 'left' position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Reverse the sublist from 'left' to 'right'
        ListNode current = prev.next;
        ListNode next;
        ListNode reversePrev = null;

        for (int i = 0; i <= right - left; i++) {
            next = current.next;
            current.next = reversePrev;
            reversePrev = current;
            current = next;
        }

        // Reconnect the reversed sublist back to the original list
        prev.next.next = current; // Connect the end of the reversed sublist to the node after 'right'
        prev.next = reversePrev;  // Connect the node before 'left' to the start of the reversed sublist

        return dummy.next;

        






    
        
    }
}

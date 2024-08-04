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
    public ListNode deleteDuplicates(ListNode head) {
           ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // prev is the last node before the sequence of duplicates
        ListNode prev = dummy;
        
        // current is the iterator for the main loop
        ListNode current = head;
        
        while (current != null) {
            // Move the current pointer to the end of the duplicates sequence
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            
            // If prev.next is still current, it means no duplicates were found for the current node
            if (prev.next == current) {
                prev = prev.next;
            } else {
                // Skip all duplicates
                prev.next = current.next;
            }
            
            // Move current pointer to the next node
            current = current.next;
        }
        
        return dummy.next;
        
    }
}

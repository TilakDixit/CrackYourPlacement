/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode l = headA;
        ListNode l1 = headB;
        
        while (l != l1) {
            l = (l == null) ? headB : l.next;
            l1 = (l1 == null) ? headA : l1.next;
        }
        
        return l;

        
    }
}

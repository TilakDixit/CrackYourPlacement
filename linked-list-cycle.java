/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode h=head;
        ListNode l=head;
   while(h!=null&&h.next!=null){
    h=h.next.next;
    l=l.next;
    if(l==h){
        return true;
    }

   }
   return false;
        
    }
}

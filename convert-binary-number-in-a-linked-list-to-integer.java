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
    public int getDecimalValue(ListNode head) {
        if(head==null||head.next==null){
            return head.val;
        }
        ListNode l=head;
        int sum=0;
        while(l!=null){
            sum=sum*2 +l.val;
            l=l.next;
        }
      
        return sum;
    }
}

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        
        int size=0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            size++;

        }
        int index= size-n;
        curr=head;
        int i=1;
        while(i<index){
            curr=curr.next;
            i++;
        }
        if(n==size){
            return head.next;
        }
        curr.next=curr.next.next;
        return head;


        
    }
}

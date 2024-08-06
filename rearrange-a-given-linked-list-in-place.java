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
     public ListNode middle(ListNode head){
        if(head==null){
            return null;
        }
       
        ListNode slow=head;
        ListNode fast =head;
        if(head.next==null){
            return head;
        }
        while(slow!=null && fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
           

        }
        return slow;
     }
      public ListNode reverseList(ListNode head){
        if(head==null){
            return head;

}        
        ListNode prev =null;
        ListNode pres=head;
        ListNode next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next= next.next;
            }
        }
        head=prev;
        return head;

    }

    public void reorderList(ListNode head) {
        ListNode mid=middle(head);
        ListNode shead=reverseList(mid);

        ListNode dhead=head;
        
        while(shead!= null && dhead!=null){
           ListNode temp =dhead.next;
           dhead.next=shead;
           dhead=temp;
           temp=shead.next;
           shead.next=dhead;
           shead=temp;
            
        }
        if(dhead!=null){
            dhead.next=null;
        }
        
    }
}

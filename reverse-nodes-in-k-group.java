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
    public ListNode reverseKGroup(ListNode head, int k) {
      if(k<=0||head==null){
        return null;
      }
      int size=0;
      ListNode dummy=head;
      while(dummy!=null){
        dummy=dummy.next;
        size++;

      }
      ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
     
      ListNode prev=dummyNode;
        ListNode curr=head;
        
      while(size>=k){
        ListNode test=prev;
         ListNode newEnd = curr;
        
        ListNode next=curr.next;
        for(int i=0;curr!=null&&i<k;i++){
            
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
       
         test.next = prev;
            newEnd.next = curr;
              prev = newEnd;

     
       
       
       
      
       size-=k;
        
      }
      return dummyNode.next ;
        
    }
}

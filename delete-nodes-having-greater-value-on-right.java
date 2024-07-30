class Solution
{
    Node compute(Node head)
    { // Step 1: Reverse the linked list
        Node reversedHead = reverse(head);
        
        // Step 2: Traverse the reversed list and remove nodes
        Node dummy = new Node(0);
        dummy.next = reversedHead;
        Node current = reversedHead;
        Node maxNode = reversedHead;
        
        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                // Remove current.next
                current.next = current.next.next;
            } else {
                // Update maxNode and move to next node
                current = current.next;
                maxNode = current;
            }
        }
        
        // Step 3: Reverse the list again to restore the original order
        return reverse(dummy.next);
        // your code here
    }
      

    private Node reverse(Node head) {
         Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
       
    
}
  

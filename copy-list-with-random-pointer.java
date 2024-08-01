
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        // Step 1: Create new nodes and insert them right after each original node
       
        Node current =head;
       
        while(current!=null){
            Node newnode =new Node(current.val);
             newnode.next = current.next;
             current.next=newnode;
              current = newnode.next;

        }
          current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
         current = head;
        Node newHead = head.next;
        while (current != null) {
            Node temp = current.next;
            current.next = temp.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            current = current.next;
        }

        return newHead;
    }
        
    }

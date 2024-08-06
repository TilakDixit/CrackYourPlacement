class Solution {
    public Node subLinkedList(Node head1, Node head2) {
        head1 = removeLeadingZeros(head1);
        head2 = removeLeadingZeros(head2);

        // Ensure head1 represents the larger number
        if (compare(head1, head2) < 0) {
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }

        Node l1 = reverse(head1);
        Node l2 = reverse(head2);

        Node dummy = new Node(0);
        Node current = dummy;
        int borrow = 0;

        while (l1 != null) {
            int val1 = l1.data - borrow;
            int val2 = (l2 != null) ? l2.data : 0;

            if (val1 < val2) {
                borrow = 1;
                val1 += 10;
            } else {
                borrow = 0;
            }

            current.next = new Node(val1 - val2);
            current = current.next;

            l1 = l1.next;
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        Node result = reverse(dummy.next);
        result = removeLeadingZeros(result);

        return result;
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    private Node removeLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return (head == null) ? new Node(0) : head;
    }

    private int compare(Node l1, Node l2) {
        int len1 = getLength(l1);
        int len2 = getLength(l2);
        if (len1 != len2) {
            return len1 - len2;
        }
        while (l1 != null && l2 != null) {
            if (l1.data != l2.data) {
                return l1.data - l2.data;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return 0;
    }

    private int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}


import java.util.stream.DoubleStream;

public class evenoddlinl {
    public Node edll(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node even=new Node(0);
        Node dummy=even;

        Node odd=new Node(0);
        Node dummy1=odd;
        while(head!=null){
            if(head.data%2==0){
                Node node=new Node(head.data);
                dummy.next=node;
                dummy=dummy.next;
            }else{
                Node node=new Node(head.data);
                dummy1.next=node;
                dummy1=dummy1.next;

            }
        }dummy=even;
        
        while(dummy.next!=null){
            dummy=dummy.next;
        }
        dummy1=odd.next;
        while(dummy1!=null){
            Node node=new Node(dummy1.data);
            dummy.next=node;
            dummy=dummy.next;
            dummy1=dummy1.next;
        }
        return even.next;



    }
    
}

import org.w3c.dom.Node;

public class zigzag {
    public static void  zigzag(Node head){
        if(head==null||head.next==null){
            return ;
        }
        Boolean flag=true;
        Node curr=head;
        while(curr!=null&&curr!=null){
            if(flag){
                if(curr.data>curr.next.data){
                    int temp=curr.data;
                    curr.data=curr.next.data;
                    curr.next.data=temp;
                }
            }else{
                if(curr.data<curr.next.data){
                    int temp=curr.data;
                    curr.data=curr.next.data;
                    curr.next.data=temp;
                }

            }
             curr= curr.next; 
  
            
            flag = !(flag);
        }

    }
    
}

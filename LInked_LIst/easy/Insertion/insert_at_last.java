package LInked_LIst.easy.Insertion;

public class insert_at_last {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    static Node insert_at_tail(Node head,int new_last){
        Node new_tail = new Node(new_last);
        if(head==null) return new_tail;
        Node temp = head;
        while(temp!=null){
            if(temp.next==null){
                temp.next = new_tail;
                break;
            }
            temp=temp.next;
        }
        
        return head;
    }
    
    public static void main(String[] args) {
        
        Node n4 = new Node(5);
        Node n3 = new Node(2);
        Node n2 = new Node(7);
        Node n1 = new Node(9);
        
        n2.next = n1 ;
        n3.next = n2;
        n4.next = n3;
        
        
        Node head = n4;
        
        head = insert_at_tail(head, 10);

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}

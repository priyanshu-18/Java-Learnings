package LInked_LIst.easy.Insertion;

public class insert_at_head {
    
        static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    
    Node head_insertion(Node head,int new_node){
        Node new_head = new Node(new_node);
        new_head.next = head;
        Node temp = new_head;
        head = new_head;

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

        
    }
}

package LInked_LIst.easy.Deletion;

public class delete_the_value_k {
    
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

    static Node delete_value(Node head,int element,Node prev){
        prev = null;

        if(head==null) return null;

        if(head.data == element){
            head=head.next;
            return head;
        }

        Node temp = head;

        while(temp!=null){
            if(temp.data==element){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
         Node n1 = new Node(5);
        Node n2 = new Node(2);
        Node n3 = new Node(7);
        Node n4 = new Node(9);

        n2.next = n1 ;
        n3.next = n2;
        n4.next = n3;


        Node head = n4;
        Node temp = head;

        System.out.println(delete_value(temp,2,null));
    }
}

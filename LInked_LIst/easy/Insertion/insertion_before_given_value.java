package LInked_LIst.easy.Insertion;

public class insertion_before_given_value {
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

    static Node insert_before_given_value(Node head,int value,int k){
        if(head==null) return new Node(k);

        if(head.data == value){
            Node new_node = new Node(k);
            new_node.next = head;
            head = new_node;
            return head;
        }

        Node temp = head;
        while(temp.next!=null){
            if(temp.data == value){
                Node new_node = new Node(k);
                new_node.next = temp.next;
                temp.next = new_node;
                return head;
            }
            temp = temp.next;
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

         head = insert_before_given_value(head,2,69);

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

    }
}

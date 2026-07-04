package LInked_LIst.easy.Deletion;



public class delete_node {

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
    public static void main(String[] args) {


        Node n4 = new Node(5);
        Node n3 = new Node(2);
        Node n2 = new Node(7);
        Node n1 = new Node(9);

        n2.next = n1 ;
        n3.next = n2;
        n4.next = n3;

        // ==========================
        // ===== Delete the head ===
        // ==========================

        // Node head = n4;
        // head = head.next;
        
        // Node temp = head;
        // while(temp!=null){
        //     System.out.print(temp.data);
        //     if(temp.next!=null){
        //         System.out.print("->");
        //     }
        //     temp = temp.next;
        // }


        // ==========================
        // ===== Delete tail ========
        // ==========================

        // Node head = n4;
        // Node temp = head;

        // if(head==null || head.next==null){
        //     System.out.println("null");
        //     return;
        // }

        // while(temp.next.next!=null){
        //     temp = temp.next;
        // }
        //     temp.next=null;



        

        
        

        

    }
}

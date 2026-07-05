package LInked_LIst.DLL.medium;

public class delete_head_dll {
        static class Node{
        int data;
        Node next;
        Node prev;

   Node(int data) {

        this.data = data;
        this.next = null;
        this.prev = null;

    }

    Node(int data, Node next, Node prev) {

        this.data = data;
        this.next = next;
        this.prev = prev;

    }
    }
    static Node delete_head_of_Dll(Node head){
        if(head==null || head.next ==null) return null;
        head = head.next;
        head.prev=null;
        return head;

    }

    public static void main(String[] args) {
         Node n4 = new Node(9);
        Node n3 = new Node(7);
        Node n2 = new Node(5);
        Node n1 = new Node(2);


        n1.prev=null;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        n3.next = n4;

        n4.prev = n3;
        n4.next = null;


       
       Node head = delete_head_of_Dll(n1);
        Node temp = head;
       while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
    }

}

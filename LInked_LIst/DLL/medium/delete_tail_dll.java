package LInked_LIst.DLL.medium;

public class delete_tail_dll {
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
static Node deleteTail(Node head){
    if( head==null || head.next==null) return null;
    Node temp = head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next.prev=null;
    temp.next = null;
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


        Node head = deleteTail(n1);
        Node temp = head;
       while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
    }
}

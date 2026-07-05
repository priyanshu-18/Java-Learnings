package LInked_LIst.DLL.medium;

public class delete_kth_element {
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
static Node delete_kth_element(Node head, int k) {

        if (head == null || head.next == null)

            return null;

        if (k == 1) {

            head = head.next;

            head.prev = null;

            return head;

        }

        int cnt = 0;

        Node temp = head;

        while (temp != null) {

            cnt++;

            if (cnt == (k - 1)) {

                temp.next = temp.next.next;

                if (temp.next != null) {

                    temp.next.prev = temp;

                }

                break;

            }

            temp = temp.next;

        }

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


        Node head = delete_kth_element(n1,3);
        Node temp = head;
       while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
    }
}

package LInked_LIst.medium;

public class reverse_linked_list {
    class Node {
    int data;
    Node next;

    Node() {}

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    }

  

    public static Node rev_ll(Node head) {

    if (head == null || head.next == null)
        return head;

    Node newHead = rev_ll(head.next);

    head.next.next = head;
    head.next = null;

    return newHead;
}


    public static void main(String[] args) {
        
    // Node temp = head;
    // Node prev = null;
    // while (temp != null) {
    //     Node front = temp.next;
    //     temp.next = prev;
    //     prev = temp;
    //     temp = front;
    // }

    // head = prev;
    // return head;
    }
}

package LInked_LIst.medium;

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




    public static Node middleNode(Node head) {

        // brute force

        // Node temp = head;
        // int cnt = 0;

        // while (temp != null) {
        //     cnt++;
        //     temp = temp.next;
        // }

        // temp = head;

        // int getElement = ((cnt / 2) + 1);

        // cnt = 0;
        // while (temp != null) {
        //     cnt++;
        //     if (cnt == getElement) {
        //         return temp;
        //     }
        //     temp = temp.next;
        // }

        // return null;

        // optimal

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        
    }

}
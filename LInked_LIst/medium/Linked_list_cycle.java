package LInked_LIst.medium;

public class Linked_list_cycle {

    static Node  detect_loop_cycle(Node head){
          
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }


        }

        return false;

    }
    public static void main(String[] args) {
        
    }
}

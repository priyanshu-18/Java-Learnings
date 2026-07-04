package LInked_LIst.easy.Deletion;

public class delete_kth_posn {

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



    static Node delete_at_posn(Node head, int k,Node previous){
        previous=null;
        if(head==null) return null;

        if(k==1){
            head = head.next;
            return head;
        }
        Node temp = head;
        int cnt=0;
        while(temp!=null){
            cnt++;

            if(cnt==k){
            previous.next = previous.next.next;
            break;
            }

            previous=temp;
            temp=temp.next;
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

        head = delete_at_posn(temp,2,null);

        

        

    }
}

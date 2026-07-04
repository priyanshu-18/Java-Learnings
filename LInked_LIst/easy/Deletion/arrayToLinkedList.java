package LInked_LIst.easy.Deletion;

public class arrayToLinkedList {

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
        int arr[]={4,6,10,17,30,28,29};

        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){

            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }

        //traverse it 


        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data);

        if(temp.next != null){
        System.out.print(" -> ");
    }
    temp = temp.next;
    }


    
}
}

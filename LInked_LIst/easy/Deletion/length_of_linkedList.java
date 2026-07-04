package LInked_LIst.easy.Deletion;

public class length_of_linkedList {
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
        
        // Length of linked list
        
        int cnt = 0;
        // Node head = new Node(arr[0]);
        
        Node temp = head;

        while(temp !=null){
            temp = temp.next;
            cnt++;
        }

        System.out.println(cnt);
        

        // serach in LL

        int target = 6;

        // Node temp = head;
        temp = head;
        while(temp !=null){
            if(temp.data==target){ System.out.println("found"); return;}
            temp = temp.next;
        }

        System.out.println("not found");
    }
}

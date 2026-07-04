package LInked_LIst.easy;

import Arr.Medium.next_permuatation;

public class linkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Node fourth = new Node(17);
        Node third = new Node(10,fourth);
        Node second = new Node(6,third);
        Node first = new Node(4,second);

        System.out.println(first);
        System.out.println(first.data);
        System.out.println(first.next.data);
    }
}

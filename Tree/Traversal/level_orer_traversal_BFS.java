 package Tree.Traversal;

import java.util.LinkedList;
import java.util.Queue;

class Node{
 int data;
 Node left;
 Node right;
 Node(int data){
     this.data = data;
     this.left = null;
     this.right = null;
 }
 }
public class level_orer_traversal_BFS {

    static void bfs(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();

        //root in queue first one
        q.offer(root);

        while(!q.isEmpty()){
            

            //take from first one root
            Node current = q.poll();

            System.out.print(current.data+" ");

            // left child
            if(current.left!=null){
                q.offer(current.left);
            }

            // right child
            if(current.right!=null){
                q.offer(current.right);
            }

        }


    }
    public static void main(String[] args) {
         Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            
            root.left.right.left = new Node(6);
            
            root.right.left = new Node(7);
            root.right.right = new Node(8);
            
            root.right.right.left = new Node(9);
            root.right.right.right = new Node(10);
            
        bfs(root);
    }
}
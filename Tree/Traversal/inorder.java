package Tree.Traversal;

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
public class inorder {
     
        static void inorder_rec(Node root){
            if(root==null){
                return; 
            }
            inorder_rec(root.left);
            System.out.print(root.data+" ");
            inorder_rec(root.right);
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
            
            inorder_rec(root);
    }
}

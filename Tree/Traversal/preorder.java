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

public class preorder {

    static void preorder_rec(Node root){
        if(root==null){
            return; 
        }
        System.out.print(root.data+" ");
        preorder_rec(root.left);
        preorder_rec(root.right);
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

        preorder_rec(root);
    }
}

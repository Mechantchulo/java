// In binary search tree, the LHS is smaller than the RHS

// Node class with data as parameter
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

// Binary tree class representation and traversal from left to right in accordance to the root data
class BinaryTree {
    Node root;

    public void insert(int data){
        root = insertRec(root, data);

    }

    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        } else if(data < root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.data + " ");
            inorderRec(root.right);
        }
    }

}

// implementation in data
public class BST {
    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        tree.insert(0);
        tree.insert(7);
        tree.insert(16);
        tree.insert(10);
        tree.insert(29);

        tree.inorder();

    }
}
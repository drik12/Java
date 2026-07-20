import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTexp {

    // Insert into BST
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal
    static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal
    static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node root = null;

        // Create BST
        root = insert(root, 22);
        root = insert(root, 12);
        root = insert(root, 30);
        root = insert(root, 8);
        root = insert(root, 20);
        root = insert(root, 15);
        root = insert(root, 29);
        root = insert(root, 60);

        System.out.println("Inorder:");
        inorder(root);

        System.out.println("\n\nPreorder:");
        preorder(root);

        System.out.println("\n\nPostorder:");
        postorder(root);
    }
}
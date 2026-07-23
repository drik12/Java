import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTsearch {

    // Search function
    boolean search(Node root, int x) {
        if (root == null)
            return false;

        if (root.data == x)
            return true;
        else if (x < root.data)
            return search(root.left, x);
        else
            return search(root.right, x);
    }

    public static void main(String[] args) {

        // Creating the BST manually
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        BSTsearch obj = new BSTsearch();

        if (obj.search(root, key))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

        sc.close();
    }
}
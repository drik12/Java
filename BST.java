import java.util.LinkedList;
import java.util.Queue;

// Node structure
class Node {
    int data;
    Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}

class BST {
    static void levelOrder(Node root) {

        if (root == null)
        return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

            while (!queue.isEmpty()) {

                int size = queue.size();   // Number of nodes in the current level

                for (int i = 0; i < size; i++) {

                    Node current = queue.poll();
                    System.out.print(current.data + " ");

                    if (current.left != null)
                        queue.add(current.left);

                    if (current.right != null)
                        queue.add(current.right);
                }

                System.out.println(); // Move to the next line after each level
            }
    }


    static Node insert(Node root, int key) {

        // If the tree is empty, return a new node
        if (root == null)
            return new Node(key);

        // Otherwise, recur down the tree
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    public static void main(String[] args) {
        Node root = null;

        // Create BST
        //       22
        //      /  \
        //     12   30
        //     / \   
        //    8  20
        //       / \
        //      15  30

        root = insert(root, 22);
        root = insert(root, 12);
        root = insert(root, 30);
        root = insert(root, 8);
        root = insert(root, 29);
        root = insert(root, 60);
       

        levelOrder(root);
    }
}
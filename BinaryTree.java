import java.util.*;

/**
 * Node of a Binary Tree.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    /**
     * Creates a new tree node.
     *
     * @param val Value to be stored in the node.
     */
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    /**
     * Performs a Level Order Traversal (Breadth-First Search) on a binary tree.
     *
     * <p>The traversal visits nodes level by level, starting from the root.
     * A queue is used to process nodes in First-In-First-Out (FIFO) order.</p>
     *
     * Algorithm:
     * 1. If the tree is empty, return an empty list.
     * 2. Create an empty queue and insert the root node.
     * 3. Repeat until the queue becomes empty:
     *    a. Remove the front node from the queue.
     *    b. Store its value in the result list.
     *    c. Insert its left child into the queue (if it exists).
     *    d. Insert its right child into the queue (if it exists).
     * 4. Return the result list.
     *
     * Time Complexity: O(n)
     * - Every node is visited exactly once.
     *
     * Space Complexity: O(n)
     * - The queue may store up to n nodes in the worst case.
     *
     * @param root Root node of the binary tree.
     * @return List containing node values in level order.
     */
    static List<Integer> levelOrder(TreeNode root) {

        // List to store the traversal result
        List<Integer> result = new ArrayList<>();

        // Return an empty list if the tree is empty
        if (root == null)
            return result;

        // Queue used for Breadth-First Search (BFS)
        Queue<TreeNode> queue = new LinkedList<>();

        // Insert the root node into the queue
        queue.offer(root);

        // Continue until all nodes have been processed
        while (!queue.isEmpty()) {

            // Remove the front node from the queue
            TreeNode current = queue.poll();

            // Store the current node's value
            result.add(current.val);

            // Add the left child to the queue if it exists
            if (current.left != null)
                queue.offer(current.left);

            // Add the right child to the queue if it exists
            if (current.right != null)
                queue.offer(current.right);
        }

        // Return the level order traversal
        return result;
    }

    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform level order traversal
        List<Integer> traversal = levelOrder(root);

        // Display the result
        System.out.println("Level Order Traversal: " + traversal);
    }
}
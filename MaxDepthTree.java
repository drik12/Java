// Definition for a Binary Tree Node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MaxDepthTree {

    // Function to find the maximum depth (height) of a binary tree
    public static int maxDepth(TreeNode root) {

        // Base Case:
        // If the tree is empty, its height is 0.
        if (root == null)
            return 0;

        // Recursively calculate the height of the left subtree
        int leftHeight = maxDepth(root.left);

        // Recursively calculate the height of the right subtree
        int rightHeight = maxDepth(root.right);

        // Return the larger height + 1 (for the current node)
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        // Creating the binary tree
        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Print the maximum depth of the tree
        System.out.println("Maximum Depth = " + maxDepth(root));
    }
}
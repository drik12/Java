import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTree {

    static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.val);

            if (current.left != null)
                queue.offer(current.left);

            if (current.right != null)
                queue.offer(current.right);
        }

        return result;
    }

    public static void main(String[] args) {

        // Creating the tree
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> ans = levelOrder(root);

        System.out.println(ans);
    }
}
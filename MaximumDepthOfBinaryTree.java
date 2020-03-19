import java.util.LinkedList;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int height = 0;
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()) {
            height++;
            int queue_size = queue.size();

            for(int i = 0; i < queue_size; i++) {
                TreeNode node = queue.poll();

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }
        }

        return height;
    }

    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        return Math.max(left_depth, right_depth) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

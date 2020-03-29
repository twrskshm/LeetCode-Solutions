import java.util.Stack;

public class PathSum {
    public static boolean hasPathSum(final TreeNode root, final int sum) {
        if (root == null)
            return false;

        Stack<TreeNode> nodesToExplore = new Stack<>();
        Stack<Integer> sumTillNode = new Stack<>();
        nodesToExplore.push(root);
        sumTillNode.push(root.val);

        while (!nodesToExplore.isEmpty()) {
            TreeNode currentNode = nodesToExplore.pop();
            int currentSum = sumTillNode.pop();

            if (currentSum == sum && currentNode.left == null && currentNode.right == null)
                return true;
            else {
                if (currentNode.left != null) {
                    nodesToExplore.push(currentNode.left);
                    sumTillNode.push(currentNode.left.val + currentSum);
                }

                if (currentNode.right != null) {
                    nodesToExplore.push(currentNode.right);
                    sumTillNode.push(currentNode.right.val + currentSum);
                }
            }
        }

        return false;
    }

    public static boolean hasPathSum(final TreeNode root, final int sum) {
        if (root == null)
            return false;

        if (root.val == sum && root.left == null && root.right == null)
            return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(final int x) {
        val = x;
    }
}
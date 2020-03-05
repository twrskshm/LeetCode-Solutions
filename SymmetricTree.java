public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return symmetric(root, root);
    }

    public static boolean symmetric(TreeNode root_one, TreeNode root_two) {
        if(root_one == null && root_two == null) return true;
        if(root_one == null || root_two == null) return false;

        return (root_one.val == root_two.val) && symmetric(root_one.left, root_two.right) && symmetric(root_one.right, root_two.left);
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

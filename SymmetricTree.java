import java.util.LinkedList;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode one = queue.poll(), two = queue.poll();

            if(one == null && two == null) continue;

            if(one == null || two == null) return false;

            if(one.val != two.val) return false;

            queue.add(one.left);
            queue.add(two.right);
            queue.add(one.right);
            queue.add(two.left);
        }

        return true;
    }

    public static boolean isSymmetric(TreeNode root) {
        return symmetric(root, root);
    }

    public static boolean symmetric(TreeNode one, TreeNode two) {
        if(one == null && two == null) return true;

        if(one == null || two == null) return false;

        return (one.val == two.val) && symmetric(one.right, two.left) && symmetric(one.left, two.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x; }
}
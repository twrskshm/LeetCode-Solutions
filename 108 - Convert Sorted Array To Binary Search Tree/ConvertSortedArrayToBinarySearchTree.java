import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(final int[] nums) {
        if (nums.length == 0)
            return null;

        int middleIndex = nums.length / 2;
        TreeNode root = new TreeNode(nums[middleIndex]);

        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, middleIndex));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, middleIndex + 1, nums.length));
        return root;
    }
}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(final int x) {
        val = x;
    }
}

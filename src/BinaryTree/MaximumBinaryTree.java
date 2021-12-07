package BinaryTree;

/**
 * @author away
 * @date 2021-11-30 12:05
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }

    private TreeNode construct(int[] nums, int start, int end) {
        if (end < start) {
            return null;
        }
        int rootval = -1;
        int idx = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > rootval) {
                rootval = nums[i];
                idx = i;
            }
        }
        TreeNode root = new TreeNode(rootval);

        root.left = construct(nums,start,idx-1);
        root.right = construct(nums, idx + 1, end);

        return root;
    }
}

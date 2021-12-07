package BinaryTree;

/**
 * @author away
 * @date 2021-11-29 14:32
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (targetSum < 0) {
            return false;
        }
        if (targetSum == 0 && root.left == null && root.right == null) {
            return true;
        }
        boolean left = hasPathSum(root.left,targetSum-root.val);
        boolean right = hasPathSum(root.right,targetSum-root.val);

        return left||right;
    }


}

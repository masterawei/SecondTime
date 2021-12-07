package BinaryTree;

/**
 * @author away
 * @date 2021-11-28 17:17
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {

        return countHeight(root)==-1;
    }

    int countHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = countHeight(root.left);
        if (left == -1) {
            return -1;
        }
        int right = countHeight(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;

    }


}

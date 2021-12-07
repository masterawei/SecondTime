package BinaryTree;

/**
 * @author away
 * @date 2021-11-30 20:55
 */
public class MinimumAbsoluteDifferenceInBst {

    private int result =Integer.MAX_VALUE;
    private TreeNode preNode = null;
    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return result;
    }

    private void getMin(TreeNode root) {
        if (root == null) {
            return;
        }

        getMin(root.left);
        if (preNode != null) {
            result = Math.min(result,Math.abs(preNode.val-root.val));
        }
        preNode = root;
        getMin(root.right);
    }
}

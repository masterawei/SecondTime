package BinaryTree;

/**
 * @author away
 * @date 2021-11-30 19:46
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return validation(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }


    public boolean validation(TreeNode root, long minval, long maxval) {
        if (root == null) {
            return true;
        }
        boolean left = validation(root.left,minval,root.val);
        boolean right =validation(root.right,root.val,maxval);
        if (root.val <= minval || root.val >= maxval) {
            return false;
        }
        return left&&right;
    }
}

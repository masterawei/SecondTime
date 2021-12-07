package BinaryTree;

/**
 * @author away
 * @date 2021-12-01 10:38
 */
public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode tmp = root;
        while (true) {
            if (tmp.val > val) {
                if (tmp.left != null) {
                    tmp = tmp.left;
                }else {
                    tmp.left = new TreeNode(val);
                    break;
                }
            } else if (tmp.val < val) {
                if (tmp.right != null) {
                    tmp = tmp.right;
                } else {
                    tmp.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}

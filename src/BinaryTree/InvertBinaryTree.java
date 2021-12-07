package BinaryTree;

/**
 * @author away
 * @date 2021-11-27 14:31
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root==null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

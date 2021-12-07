package BinaryTree;

/**
 * @author away
 * @date 2021-12-02 13:43
 */
public class ConvertBstToGreaterTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        sum +=root.val;
        root.val = sum;
        convertBST(root.left);

        return root;
    }




}

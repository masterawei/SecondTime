package BinaryTree;

/**
 * @author away
 * @date 2021-11-28 15:58
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        while (root != null) {

            int leftHeight = countHeight(root.left);
            int rightHeight = countHeight(root.right);
            if (leftHeight == rightHeight) {
                count += (1 << leftHeight);
                root = root.right;
            }else {
                count += (1 << rightHeight);
                root = root.left;
            }
        }

        return count;


    }

    int countHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int h = 0;
        while (root != null) {
            root = root.left;
            h++;
        }
        return h;
    }
}

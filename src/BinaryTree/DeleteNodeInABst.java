package BinaryTree;

/**
 * @author away
 * @date 2021-12-01 11:19
 */
public class DeleteNodeInABst {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.val) {
            root.right = deleteNode(root.right,key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left,key);
        }else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }else {
                TreeNode node = root.right;
                while (node.left != null) {
                    node = node.left;
                }

                node.left=root.left;
                root = root.right;
            }

        }
        return root;

    }
}

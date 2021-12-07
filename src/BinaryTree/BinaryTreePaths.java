package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author away
 * @date 2021-11-29 9:45
 */
public class BinaryTreePaths {
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        path(root,sb);
        return list;
    }

    private void path(TreeNode root, StringBuilder sb) {
        StringBuilder newsb = new StringBuilder(sb);
        if (root.left == null && root.right == null) {
            newsb.append(root.val);
            list.add(newsb.toString());
            return;
        }
        newsb.append(root.val);
        newsb.append("->");
        if (root.left != null) {

            path(root.left,newsb);
        }
        if (root.right != null) {

            path(root.right,newsb);
        }
    }
}

package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author away
 * @date 2021-11-29 10:55
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            res = queue.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
        }
        return res;
    }
}

package BinaryTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author away
 * @date 2021-11-27 10:43
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (root != null || !queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                list.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);

                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            res.add(new LinkedList<>(list));
        }
        return res;

    }
}

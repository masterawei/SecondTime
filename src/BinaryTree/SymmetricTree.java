package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author away
 * @date 2021-11-27 14:46
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return help(root.left,root.right);
    }

    boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null) {
            return false;
        }
        if (right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return help(left.left, right.right) && help(right.left, left.right);
    }

    public boolean isSymmetricTraverse(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i += 2) {
                TreeNode node1 = queue.poll();
                TreeNode node2 = queue.poll();
                if (node1 == null && node2 == null) {
                    continue;
                }
                if (node1 == null) {
                    return false;
                }
                if (node2 == null) {
                    return false;
                }
                if (node1.val != node2.val) {
                    return false;
                }
                queue.offer(node1.left);
                queue.offer(node2.right);
                queue.offer(node1.right);
                queue.offer(node2.left);
            }
        }

        return true;
    }

}

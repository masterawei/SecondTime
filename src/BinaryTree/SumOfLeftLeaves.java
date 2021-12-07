package BinaryTree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author away
 * @date 2021-11-29 10:15
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        HashSet<TreeNode> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp.left == null && tmp.right == null && set.contains(tmp)) {
                sum+=tmp.val;
            }
            if (tmp.left != null) {
                queue.offer(tmp.left);
                set.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.offer(tmp.right);
            }
        }
        return sum;

    }

    public int sumOfLeftLeavesRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = sumOfLeftLeavesRecursion(root.left);
        int right = sumOfLeftLeavesRecursion(root.right);
        int midVal = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            midVal = root.left.val;
        }
        return left+right+midVal;

        }
    }

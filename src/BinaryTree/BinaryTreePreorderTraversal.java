package BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-11-27 8:19
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null||!stack.isEmpty()) {
            if (root!=null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop().right;
            }


        }
        return res;
    }


    public List<Integer> preorderTraversalRecursion(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        help(root,res);
        return res;
    }

    void help(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        res.add(root.val);
        help(root.left, res);
        help(root.right, res);

    }



}

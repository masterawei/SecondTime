package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-11-30 9:55
 */
public class PathSumIi {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path(root,targetSum,new LinkedList<Integer>());
        return res;
    }

    private void path(TreeNode root, int targetSum, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            list.add(root.val);
            res.add(new LinkedList<>(list));
            return;
        }
        list.add(root.val);
        path(root.left,targetSum-root.val,new LinkedList<>(list));
        path(root.right,targetSum-root.val,new LinkedList<>(list));


    }

}

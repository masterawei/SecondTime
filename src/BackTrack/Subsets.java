package BackTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-04 10:49
 */
public class Subsets {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        //res.add(new LinkedList<>(path));
        backtrack(nums,0);
        return res;
    }

    private void backtrack(int[] nums, int idx) {
        res.add(new LinkedList<>(path));
        for (int i = idx; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1);
            path.removeLast();
        }
    }
}

package BackTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-04 11:03
 */
public class SubsetsIi {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0);
        return res;
    }

    private void backtrack(int[] nums, int idx) {
        res.add(new LinkedList<>(path));

        for (int i = idx; i < nums.length; i++) {
            if (i >= idx + 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            backtrack(nums, i + 1);
            path.removeLast();
        }
    }
}

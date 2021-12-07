package BackTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author away
 * @date 2021-12-05 9:52
 */
public class PermutationsIi {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] set = new boolean[nums.length];
        backtrack(nums, set);
        return res;
    }

    private void backtrack(int[] nums, boolean[] set) {
        if (path.size() == nums.length) {
            res.add(new LinkedList<>(path));
            return;
        }
        boolean[] used = new boolean[21];
        for (int i = 0; i < nums.length; i++) {
            if (set[i]){
                continue;
            }
            if (used[nums[i] + 10]) {
                continue;
            }else used[nums[i]+10] = true;
            path.add(nums[i]);
            set[i] = true;
            backtrack(nums, set);
            set[i] = false;
            path.removeLast();

        }

    }
}

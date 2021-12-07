package BackTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-05 9:33
 */
public class Permutations {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] set = new boolean[21];
        backtrack(nums,set);
        return res;
    }

    private void backtrack(int[] nums,boolean[] set) {
        if (path.size() == nums.length) {
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (set[nums[i] + 10]) {
                continue;
            }else set[nums[i]+10]=true;
            path.add(nums[i]);
            backtrack(nums,set);
            set[nums[i]+10]=false;
            path.removeLast();
        }
    }
}

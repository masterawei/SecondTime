package BackTrack;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author away
 * @date 2021-12-04 21:51
 */
public class IncreasingSubsequences {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int idx) {
        if (path.size() >= 2) {
            res.add(new LinkedList<>(path));
        }
        boolean[] contains = new boolean[201];
        for (int i = idx; i < nums.length; i++) {
            if (contains[nums[i]]) {
                continue;
            }else contains[nums[i]]=true;
            if (path.size()>0&&nums[i] < path.getLast()) {
                continue;
            }
            if (i >= idx + 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            backtrack(nums, i + 1);
            path.removeLast();
        }
    }

    @Test
    public void test() {
        findSubsequences(new int[]{1, 2, 3, 1, 1, 1, 1});
        System.out.println(res);
    }
}

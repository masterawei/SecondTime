package BackTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-03 21:27
 */
public class CombinationSum {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return res;
    }

    private void backtrack(int[] candidates, int target, int idx) {
        if (target == 0) {
            res.add(new LinkedList<>(list));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i);
            list.removeLast();
        }
    }
}

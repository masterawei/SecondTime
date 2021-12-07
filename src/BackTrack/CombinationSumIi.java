package BackTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-03 21:36
 */
public class CombinationSumIi {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0);
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
            if (i >= idx+1 && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1);
            list.removeLast();
        }


    }
}

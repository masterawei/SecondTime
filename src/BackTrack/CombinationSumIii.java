package BackTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-03 6:32
 */
public class CombinationSumIii {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k,n,1);
        return res;
    }

    private void backtrack(int k, int n, int idx) {
        if (n == 0&&list.size()==k) {
            res.add(new LinkedList<>(list));
            return;
        }
        if (n < 0) {
            return;
        }
        for (int i = idx; i <= 9 ; i++) {
            list.add(i);
            backtrack(k,n-i,i+1);

            list.removeLast();
        }
    }
}

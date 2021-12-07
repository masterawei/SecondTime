package BackTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-03 6:16
 */
public class Combinations {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n,k,1);
        return res;
    }

    private void backtrack(int n, int k,int idx) {
        if (list.size() == k) {
            res.add(new LinkedList<>(list));
            return;
        }
        for (int i = 1; i <= n; i++) {
            list.add(i);
            backtrack(n, k, i + 1);
        }
        list.removeLast();
    }
}

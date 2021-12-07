package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author away
 * @date 2021-11-22 14:30
 */
public class NSum {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> NSum(int[] nums, int n) {
        Arrays.sort(nums);
        help(nums, n);
        return res;
    }

    void help(int[] nums, int n) {
        if (n == 3) {
            
        }
    }
}

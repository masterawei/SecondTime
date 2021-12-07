package HashTable;

import java.util.HashMap;

/**
 * @author away
 * @date 2021-11-22 9:26
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int gap = target-nums[i];
            if (map.containsKey(gap)) {
                return new int[]{i, map.get(gap)};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}

package HashTable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author away
 * @date 2021-11-22 9:39
 */
public class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1+num2;
                map1.put(sum,map1.getOrDefault(sum,0)+1);
            }
        }
        int res = 0;
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int sum = num3+num4;
                if (map1.containsKey(-sum)) {
                    res+=map1.get(-sum);
                }
            }
        }


    return res;
    }
}

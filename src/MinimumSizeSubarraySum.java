import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author away
 * @date 2021-11-21 8:03
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum+=nums[right];
            right++;
            while (sum >= target) {
                res = Math.min(res,right-left);
                sum-=nums[left];
                left++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }

    @Test
    public void test() {
        int[] a = {12,28,83,4,25,26,25,2,25,25,25,12};
        System.out.println(minSubArrayLen(213, a));
    }


}

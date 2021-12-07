package Greedy;

/**
 * @author away
 * @date 2021-12-07 9:31
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int subarraySum =0 ;
        for (int i = 0; i < nums.length; i++) {
            subarraySum+=nums[i];
            max = Math.max(max,subarraySum);
            if (subarraySum < 0) {
                subarraySum = 0;
            }

        }
        return max;
    }
}

package Greedy;

/**
 * @author away
 * @date 2021-12-07 9:15
 */
public class WiggleSubsequence {

    public int wiggleMaxLength(int[] nums) {
        int count = 1;
        boolean negative = false;
        boolean positive = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && !positive) {
                positive = true;
                negative = false;
                count++;
            }
            if (nums[i] < nums[i - 1] && !negative) {
                negative =true;
                positive = false;
                count++;
            }
        }
        return count;
    }


}

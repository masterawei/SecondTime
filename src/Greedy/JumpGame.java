package Greedy;

/**
 * @author away
 * @date 2021-12-07 11:10
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int cover = nums[0];

        for (int i = 1; i <= cover; i++) {
            cover = Math.max(cover,nums[i]+i);
            if (cover >= nums.length-1) {
                return true;
            }
        }
        return false;
    }
}

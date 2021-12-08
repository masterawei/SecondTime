package Greedy;

import org.junit.Test;

/**
 * @author away
 * @date 2021-12-08 8:45
 */
public class JumpGameIi {
    public int jump(int[] nums) {
        int length = nums.length;
        int minStep = 0;
        int maxFar = 0;
        int end = 0;
        for (int i = 0; i < length - 1; i++) {
            maxFar = Math.max(maxFar,i+nums[i]);

            if (i == end) {
                end = maxFar;
                minStep++;
            }
        }
        return minStep;
    }

    @Test
    public void test() {
        int[] a ={1,2,1,1,1};
        System.out.println(jump(a));
    }
}

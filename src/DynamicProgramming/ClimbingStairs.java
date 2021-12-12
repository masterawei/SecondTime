package DynamicProgramming;

/**
 * @author away
 * @date 2021-12-11 19:21
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int twoStep =0;
        int oneStep = 1;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = twoStep+oneStep;
            twoStep = oneStep;
            oneStep = res;
        }
        return res;
    }
}

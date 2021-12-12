package DynamicProgramming;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-12 16:39
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] =1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }

        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

}

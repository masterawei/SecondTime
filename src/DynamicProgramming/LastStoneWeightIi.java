package DynamicProgramming;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-13 8:51
 */
public class LastStoneWeightIi {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum+=stone;
        }
        int target = sum/2;
        //当把dp数组长度定义为传入的数组长度+1时，就需要在各处条件判断的时候注意
        int[][] dp = new int[stones.length+1][target+1];
        //注意点1:i的取值范围发生变化
        for (int i = 1; i <= stones.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                //注意点2:对元素的索引发生变化
                if (j >= stones[i-1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i-1][j - stones[i - 1]] + stones[i - 1]);
                }

            }
        }
       //这里为啥需要*2,因为如果是偶数就会成为0,如果是奇数,就会剩余.
        return sum - dp[stones.length][target]*2;
    }

    @Test
    public void test() {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeightII(stones));
    }
}

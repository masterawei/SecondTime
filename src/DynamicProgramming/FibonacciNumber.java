package DynamicProgramming;

/**
 * @author away
 * @date 2021-12-11 19:16
 */
public class FibonacciNumber {
    public int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int pre =1;
        int prePre = 0;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = pre+prePre;
            prePre = pre;
            pre = res;
        }
        return res;
    }
}

package BinarySearch;

import org.junit.Test;
import sun.security.provider.MD2;

/**
 * @author away
 * @date 2021-11-20 16:08
 */
public class Sqrtx {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 1;
        int right = x;
        while (left < right) {
            int mid = (right-left)/2+left;
            if (x / mid > mid) {
                left = mid+1;
            } else if (x / mid == mid) {
                return mid;
            }else right = mid;
            System.out.println(left);
        }
        return left<x/left?left:left-1;
    }

    @Test
    public void test() {
        System.out.println(mySqrt(2147483647));
        //System.out.println(46340*46340);
    }
}

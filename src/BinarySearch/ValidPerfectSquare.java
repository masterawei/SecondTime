package BinarySearch;

/**
 * @author away
 * @date 2021-11-20 16:49
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int x) {
        if (x == 1) {
            return true;
        }
        int left = 1;
        int right = x;
        while (left < right) {
            int mid = (right-left)/2+left;
            if (mid == x / mid) {
                return mid*mid==x;
            } else if (mid < x / mid) {
                left = mid+1;
            }else right = mid;
        }
        return false;
    }
}

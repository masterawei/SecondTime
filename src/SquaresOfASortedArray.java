/**
 * @author away
 * @date 2021-11-20 17:43
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int left = 0;
        int right = len-1;
        int idx = right;
        while (left <= right) {
            if (abs(nums[right]) > abs(nums[left])) {
                res[idx] = nums[right]*nums[right];
                right--;
            }else {
                res[idx] = nums[left] * nums[left];
                left++;
            }
            idx--;
        }
        return res;
    }

    public int abs(int x) {
        return x<0?-x:x;
    }
}

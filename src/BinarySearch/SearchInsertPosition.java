package BinarySearch;

/**
 * @author away
 * @date 2021-11-20 10:40
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (right-left)/2+left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            }else left=mid+1;
        }

        return left;

    }
}

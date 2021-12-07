package BinarySearch;

import org.junit.Test;

/**
 * @author away
 * @date 2021-11-20 9:31
 */
public class BinarySearch {
    public int search(int[] nums,int target) {
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

        return -1;

    }

    @Test
    public void test() {
        int[] test = {5,7,7,8,8,10};
        System.out.println(search(test,10));
    }

    public int binarySearch(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (right-left)/2+left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid-1;
            }else left= mid+1;
        }
        return -1;
    }

}

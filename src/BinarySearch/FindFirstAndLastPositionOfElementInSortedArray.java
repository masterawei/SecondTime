package BinarySearch;

import org.junit.Test;

import java.util.List;

/**
 * @author away
 * @date 2021-11-20 11:13
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (right-left)/2+left;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid;
            }else left = mid+1;
        }
        if (left==nums.length||nums[left] != target) {//一直向坐收缩,直到0,如果0处的不等于target,说明不存在
            return new int[]{-1, -1};
        }
        int[] res = new int[2];
        res[0] = left;
        left = 0;
        right = nums.length;
        while (left < right) {
            int mid = (right-left)/2+left;
            if (nums[mid] == target) {
                left= mid+1;
            } else if (nums[mid] > target) {
                right = mid;
            }else left=mid+1;
        }
        left--;
        res[1] = left;
        return res;
    }


    public int[] searchRange2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = (right-left)/2+left;
            if (nums[mid] == target) {
                right = mid-1;
            } else if (target < nums[mid]) {
                right = mid-1;
            }else left = mid+1;
        }
        if (left == nums.length || nums[left] != target) {
            return new int[]{-1,-1};
        }
        int[] res = new int[]{left,left};
        left = 0;
        right = nums.length-1;
        while (left <= right) {
            int mid = (right-left)/2+left;
            if (target == nums[mid]) {
                left = mid+1;
            } else if (target < nums[mid]) {
                right = mid-1;
            }else left = mid+1;
        }
        res[1] = --left;
        return res;
    }

    public int[] searchRange3(int[] nums, int target) {
        int idx = bSearch(nums, target);
        if (idx == -1) {
            return new int[]{-1,-1};
        }
        int leftBoarder = idx;
        for (int i = idx; i >= 0; i--) {
            if (nums[i] == target) {
                leftBoarder = i;
            }else break;
        }
        int rightBoarder = idx;
        for (int i = idx; i < nums.length; i++) {
            if (nums[i] == target) {
                rightBoarder = i;
            }else break;
        }

        return new int[]{leftBoarder,rightBoarder};

    }

    public int bSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (right-left)/2+left;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid;
            }else left = mid+1;
        }
        return -1;
    }


    @Test
    public void test() {
        int[] a = {2,2};
        searchRange(a,3);
    }
}

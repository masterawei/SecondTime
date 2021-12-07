/**
 * @author away
 * @date 2021-11-20 17:11
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            }else left++;
        }
        return left;
    }
}

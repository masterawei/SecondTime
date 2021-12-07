package StackAndQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author away
 * @date 2021-11-25 10:42
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.addLast(i);
            if (queue.size() > k) {
                queue.pollFirst();
            }
            if (i+1>=k){
                res[i-k+1] = nums[queue.peekFirst()];
            }

        }


        return res;
    }
}

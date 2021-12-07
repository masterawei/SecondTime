package StackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author away
 * @date 2021-11-26 13:36
 */
public class TopKFrequentElementsComments {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        //根据map的value值正序排，相当于一个小顶堆
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((o1,o2)->o1.getValue()-o2.getValue());
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            res[i] = queue.poll().getKey();
            }
        return res;
    }
}

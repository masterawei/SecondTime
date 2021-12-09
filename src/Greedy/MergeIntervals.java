package Greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-09 10:52
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        Arrays.sort(intervals,(o1,o2)->{
            return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
        });

        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.getLast();
            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(intervals[i][1],last[1]);
                res.set(res.size() - 1, last);
            }else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}

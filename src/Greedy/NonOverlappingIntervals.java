package Greedy;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-09 10:07
 */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        int removeCount = 0;
        int gap =1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - gap][1]) {
                removeCount++;
                gap++;
            }else {
                gap=1;
            }
        }
        return removeCount;
    }
}

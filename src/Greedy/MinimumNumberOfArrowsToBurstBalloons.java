package Greedy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author away
 * @date 2021-12-09 9:10
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1[0], p2[0]));
        int arrowCount = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                arrowCount++;
            } else {points[i][1] = Math.min(points[i][1], points[i - 1][1]);}
        }
        for (int[] point : points) {
            System.out.println(Arrays.toString(point));
        }
        return arrowCount;
    }


}

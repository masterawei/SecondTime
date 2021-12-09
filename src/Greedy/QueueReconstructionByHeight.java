package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author away
 * @date 2021-12-09 8:48
 */
public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] person : people) {
            list.add(person[1],person);
        }
        return list.toArray(new int[people.length][]);
    }
}

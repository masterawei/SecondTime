package Greedy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-09 10:28
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            map[cs[i]-'a']=i;
        }
        List<Integer> res = new ArrayList<>();
        int startIdx = -1;
        int max = 0;
        for (int i = 0; i < cs.length; i++) {
            max = Math.max(max, map[cs[i] - 'a']);
            if (max == i) {
                res.add(i-startIdx);
                startIdx = i;
            }
        }
        return res;
    }

    @Test
    public void test() {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
}

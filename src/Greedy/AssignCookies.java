package Greedy;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-07 9:00
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int kid = 0;
        int cookies = 0;
        while (kid < g.length && cookies < s.length) {
            if (s[cookies] >= g[kid]) {
                kid++;
            }
            cookies++;
        }



        return kid;
    }

}

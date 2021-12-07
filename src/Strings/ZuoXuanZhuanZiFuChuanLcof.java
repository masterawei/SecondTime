package Strings;

import org.junit.Test;

/**
 * @author away
 * @date 2021-11-23 9:36
 */
public class ZuoXuanZhuanZiFuChuanLcof {
    public String reverseLeftWords(String s, int n) {
        char[] cs = s.toCharArray();
        int left= 0;
        int right = s.length()-1;
        revers(cs, left, right);
        revers(cs, 0, right - n);
        revers(cs, right - n + 1, right);


        return new String(cs);


    }

    public void revers(char[] cs, int start, int end) {
        while (start < end) {
            char tmp = cs[start];
            cs[start++] = cs[end];
            cs[end--] = tmp;
        }
    }


    @Test
    public void test() {
        String s = "abcdefg";
        System.out.println(reverseLeftWords(s,2));
    }
}

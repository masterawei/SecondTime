package Strings;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-11-24 15:24
 */
public class ImplementStrstr {

    public int strStr(String haystack, String needle) {
        char[] hs = haystack.toCharArray();
        char[] ns = needle.toCharArray();
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int h = 0;
        int n = 0;
        while (h < haystack.length() && n < needle.length()) {
            if (hs[h] == ns[n]) {
                h++;
                n++;
            }else {
                n = next[n];
            }
        }
        if (n == needle.length()) {
            return h-n;
        }
        return -1;
    }
    public void getNext(int[] next, String s){
        int i=0;
        int k = -1;
        next[0] = -1;
        while (i < s.length() - 1) {
            if (k == -1 || s.charAt(k) == s.charAt(i)) {
                i++;
                k++;
                next[i]= k;
            }else k = next[k];
        }
    }

    @Test
    public void test() {
        String s = "abcabcd";
        int[] next = new int[s.length()];
        getNext(next,s);
        System.out.println(Arrays.toString(next));
    }
}

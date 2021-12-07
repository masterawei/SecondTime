package Strings;

import org.junit.Test;

import java.util.logging.Level;

/**
 * @author away
 * @date 2021-11-23 8:49
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        char[] cs = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {//good  example
            StringBuilder sb = new StringBuilder();
            while (i>=0&&cs[i] != ' ') {//这里越界了
                sb.append(cs[i]);
                i--;
            }
            if (sb.length() != 0) {
                res.append(sb).append(' ');//出错了  出错两次
            }
        }
        System.out.println(res.toString());
        System.out.println("---");
        int idx = 0;
        while (idx < res.length()) {
            int left = idx;
            int right = left;
            while (right <= res.length()&&res.charAt(right) != ' ' ) {//这里也越界了
                right++;
            }
            idx = right+1;
            right--;
            while (left < right) {
                char tmp = res.charAt(left);
                res.setCharAt(left,res.charAt(right));
                res.setCharAt(right,tmp);
                left++;
                right--;
            }
        }
        return res.substring(0,res.length()-1);

    }

    @Test
    public void test() {
        String s = "good   example";
        System.out.println(reverseWords(s));
    }
}

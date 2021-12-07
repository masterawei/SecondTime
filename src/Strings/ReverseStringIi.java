package Strings;

/**
 * @author away
 * @date 2021-11-22 22:54
 */
public class ReverseStringIi {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int left = 0;
        int turn =0;
        while (left < s.length()) {
            left = turn * 2 * k;
            int right = Math.min(left + k - 1, s.length() - 1);

            while (left < right) {
                char tmp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = tmp;
            }
            turn++;
        }
        return new String(chars);
    }
}

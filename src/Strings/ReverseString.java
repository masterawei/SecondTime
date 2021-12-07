package Strings;

/**
 * @author away
 * @date 2021-11-22 22:50
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int left= 0;
        int right = s.length-1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}

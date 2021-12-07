package Strings;

import javafx.beans.binding.StringBinding;

/**
 * @author away
 * @date 2021-11-23 8:37
 */
public class TiHuanKongGeLcof {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }else sb.append("%20");
        }
        return sb.toString();
    }

    public String replaceSpace2(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        char[] cs = new char[s.length()+count*2];
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                cs[idx++] ='%';
                cs[idx++] = '2';
                cs[idx++] = '0';
            }else cs[idx++] = c;
        }

    return new String(cs);
    }

}

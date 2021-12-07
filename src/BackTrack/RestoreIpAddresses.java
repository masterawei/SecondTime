package BackTrack;

import org.junit.Test;

import javax.swing.table.TableModel;
import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-04 9:41
 */
public class RestoreIpAddresses {
    List<String> res = new LinkedList<>();
    LinkedList<String> path = new LinkedList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }
        backtrack(s,0);
        return res;
    }

    void backtrack(String s, int idx) {
        if (path.size() == 4) {
            res.add(String.join(".", path));
        }
        for (int i = idx; i < s.length(); i++) {
            if (s.length() - 1 - i > 3 * (3 - path.size())) {
                continue;
            }
            if (!isValid(s.substring(idx, i + 1))) {
                break;
            }
            path.add(s.substring(idx, i + 1));
            backtrack(s, i + 1);
            path.removeLast();
        }

    }

    boolean isValid(String s) {
        if (s.length() == 0) {
            return false;
        }
        if (s.length() > 1 && s.startsWith("0")) {
            return false;
        }
        //if (s.length() > 3) {
        //    return false;
        //}
        return Integer.parseInt(s) <= 255;
    }

    @Test
    public void test() {
        restoreIpAddresses("25525511135");
        System.out.println(res);
    }
}

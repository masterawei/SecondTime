package BackTrack;

import org.junit.Test;

import java.lang.reflect.WildcardType;
import java.util.LinkedList;
import java.util.List;


public class PalindromePartitioning {
    List<List<String>> res = new LinkedList<>();
    LinkedList<String> path = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    public List<List<String>> partition(String s) {
        backtrack(s,0);
        return res;
    }

    private void backtrack(String s,int start) {
        if (start == s.length()) {
            res.add(new LinkedList<>(path));
        }
        for (int i = start; i < s.length(); i++) {
            String tmp = s.substring(start,i+1);
            if (!isPalindrome(tmp)) {
                continue;
            }
            path.add(tmp);
            backtrack(s, i + 1);
            path.removeLast();
        }
    }

    boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    


}

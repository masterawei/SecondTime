package BackTrack;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-03 20:34
 */
public class LetterCombinationsOfAPhoneNumber {
    String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    List<String> res = new LinkedList<>();
    public List<String> letterCombinations(String digits) {
        char[] cs = digits.toCharArray();
        backtrack(cs,0,new StringBuilder());
        return res;
    }

    private void backtrack(char[] cs, int idx, StringBuilder stringBuilder) {
        if (stringBuilder.length() == cs.length) {
            res.add(stringBuilder.toString());
            return;
        }
        String str = map[cs[idx]-'0'];
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            backtrack(cs, idx + 1, new StringBuilder(stringBuilder));
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }


    @Test
    public void tst() {
        letterCombinations("23");
        System.out.println(res);
    }
}

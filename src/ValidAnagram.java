/**
 * @author away
 * @date 2021-11-22 8:10
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[chars[i]-'a']+=1;
            table[chart[i]-'a']-=1;
        }
        for (int count : table) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

package HashTable;

import java.util.HashMap;

/**
 * @author away
 * @date 2021-11-22 10:18
 */
public class RansomNote {
    public boolean canConstruct(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }else return false;
        }
        return true;
    }
}

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                // Key exists: check if it matches the current character in t
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                // Key is new: check if value was already taken by a different key
                if (mappedValues.contains(charT)) {
                    return false;
                }
                map.put(charS, charT);
                mappedValues.add(charT);
            }
        }

        return true;
    }
}
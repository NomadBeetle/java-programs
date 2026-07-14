import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            hm.put(character, hm.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            char character = t.charAt(i);
            if (!hm.containsKey(character) || hm.get(character) == 0){
                return false;
            }
            
            hm.put(character, hm.get(character) - 1);
        }

        return true;
    }
}
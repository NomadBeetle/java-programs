class Solution {
    public boolean checkIfPangram(String sentence) {
                char[] character = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean[] res = new boolean[26];
        int count = 0;
        for (int i = 0; i < character.length; i++){
            for (int j = 0; j < sentence.length(); j++){
                if (character[i] == sentence.charAt(j)){
                    res[i] = true;
                }
            }
        }

        for (boolean result : res){
            if (result != false){
                count += 1;
            } 
        }

        if (count == 26){
            return true;
        } else {
            return false;
        }
    }
}
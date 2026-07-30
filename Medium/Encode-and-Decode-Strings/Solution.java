import java.util.ArrayList;

class Solution { 
    // Encodes an array of strings to a single string.
    public String encode(String arr[]) { 
        StringBuilder encodedString = new StringBuilder(); 
        for (String str : arr) { 
            encodedString.append(str.length()).append("#").append(str); 
        } 
        return encodedString.toString(); 
    } 

    // Decodes a single string back to an array of strings.
    public ArrayList<String> decode(String s) { 
        ArrayList<String> decodedRes = new ArrayList<>(); 
        int i = 0; 
        
        while (i < s.length()) { 
            int hashPos = s.indexOf('#', i); 
            
            int len = Integer.parseInt(s.substring(i, hashPos)); 
            
            String originalStr = s.substring(hashPos + 1, hashPos + 1 + len); 
            decodedRes.add(originalStr); 
            
            i = hashPos + 1 + len; 
        } 
        return decodedRes; 
    } 
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start_i = 0;
        int end_i = letters.length - 1;

        while (start_i <= end_i){
            int mid = start_i + (end_i - start_i)/2;
            if (letters[mid] > target){
                end_i = mid - 1;
            } else {
                start_i = mid + 1;
            }
        }
        return letters[start_i % letters.length];
    }
}
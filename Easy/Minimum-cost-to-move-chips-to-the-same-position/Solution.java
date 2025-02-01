class Solution {
    public int minCostToMoveChips(int[] position) {
        // Initialize counters for odd and even positions
        int odd = 0;
        int even = 0;

        for (int i = 0; i < position.length; i++) {
            // Check if the current position is odd or even
            if (position[i] % 2 != 0) {
                odd++; 
            } else {
                even++; 
            }
        }

        // Return minimum among odd or even.
        return Math.min(odd, even);
    }
}

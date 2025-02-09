class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int max = 0;
        int nextmax = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            nextmax = Math.max(nextmax, i + nums[i]);

            if (max >= nums.length - 1) break;

            if (i == max) { // When we reach the current max, take a jump
                jumps++;
                max = nextmax;
            }
        }

        return jumps;
    }
}

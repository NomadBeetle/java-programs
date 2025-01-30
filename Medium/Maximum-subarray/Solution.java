class Solution {
    public int maxSubArray(int[] nums) {
            int maxsum = Integer.MIN_VALUE;
            int cur = 0;
            int curSum = 0;

            for (int i = 0; i < nums.length; i++) {
                curSum += nums[i];
                maxsum = Math.max(maxsum, curSum);
                if (curSum < 0) {
                    curSum = 0;
                }
            }
            return maxsum;
    }
}
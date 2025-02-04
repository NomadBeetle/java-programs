class Solution {
    public int maxAscendingSum(int[] nums) {
        int MaxSum = nums[0]; // Holds the highest sum of ascending elements
        int Cur_Sum = nums[0]; // Tracks the current ascending subarray sum

        for (int i = 1; i < nums.length; i++) {

            // Check if the current element continues an ascending sequence
            if (nums[i - 1] < nums[i]) {
                Cur_Sum += nums[i];
            } else {
                // Reset the current sum to the current element
                Cur_Sum = nums[i];
            }

            // Update MaxSum if the current sum is greater
            if (Cur_Sum > MaxSum) {
                MaxSum = Cur_Sum;
            }
        }

        return MaxSum;
    }
}

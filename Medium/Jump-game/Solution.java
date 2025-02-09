class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        // Traverse backwards to check if we can reach the goal
        for (int i = goal - 1; i >= 0; i--) {
            // If current index can reach or go beyond the goal
            if (i + nums[i] >= goal) { 
                goal = i;
            }
        }

        return goal == 0;
    }
}

class Solution {
    public boolean stoneGame(int[] piles) {
        Integer[][] memo = new Integer[piles.length][piles.length];
        return maxDiff(piles, 0, piles.length - 1, memo) > 0;
    }

    public int maxDiff (int[] nums, int left, int right, Integer[][] memo){
        if (left == right) { return nums[left]; }
        if (memo[left][right] != null) { return memo[left][right]; }

        int pickLeft = nums[left] - maxDiff(nums, left + 1, right, memo);
        int pickRight = nums[right] - maxDiff(nums, left, right - 1, memo);

        memo[left][right] = Math.max(pickLeft, pickRight);
        return memo[left][right];
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pos_st = -1;
        int pos_end = -1;

        // Find first occurrence (leftmost index)
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                pos_st = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (pos_st == -1) return new int[]{-1, -1}; // Target not found, return [-1, -1]

        // Find last occurrence (rightmost index)
        start = pos_st;
        end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                pos_end = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{pos_st, pos_end};
    }
}

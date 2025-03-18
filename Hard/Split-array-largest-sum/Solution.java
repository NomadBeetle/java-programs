// The answer lies between the max element and sum of all elements.
// Use binary search to minimize the largest subarray sum.
// Count partitions and adjust the search space accordingly.

 class Solution {
    public int splitArray(int[] nums, int m) {
        int minSum = 0;
        int maxSum = 0;

        for (int num : nums) {
            minSum = Math.max(num, minSum); // Max element as lower bound
            maxSum += num; // Sum of elements as upper bound
        }

        int start = minSum;
        int end = maxSum;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int curSum = 0;

            for (int num : nums) {
                if (curSum + num > mid) {
                    pieces++;
                    curSum = num; // Start a new subarray
                } else {
                    curSum += num;
                }
            }

            if (pieces <= m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start; // Start == End at convergence
    }
}

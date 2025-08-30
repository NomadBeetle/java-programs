import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                for (int k = j + 1; k < n - 1; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;

                    long sum3 = (long) nums[i] + nums[j] + nums[k];
                    long need = (long) target - sum3;

                    if (binarySearchLong(nums, k + 1, n - 1, need)) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], (int) need));
                    }
                }
            }
        }

        return res;
    }

    private boolean binarySearchLong(int[] arr, int left, int right, long target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) arr[mid] == target) return true;
            else if ((long) arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}

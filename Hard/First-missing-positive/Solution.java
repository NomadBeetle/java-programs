class Solution {

    // Swap function to exchange elements in the array
    private void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its correct position if possible
        for (int i = 0; i < n; i++){
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]){
                Swap(nums, i, nums[i] - 1);
            }
        }

        // Find the first missing positive number
        for (int i = 1; i <= n; i++){
            if (i != nums[i - 1]){
                return i;
            }
        }

        return n + 1; // If all are in place, return n+1
    }
}

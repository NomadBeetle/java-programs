class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums){
            total += num;
        }
        int rightSum = total;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++){
            rightSum -= nums[i];
            if (rightSum == leftSum){
                return i;
            } 
            leftSum += nums[i];
        }

        return -1;
    }
}
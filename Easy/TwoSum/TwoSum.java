class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                int num1 = nums[i];
                int num2 = nums[j];
                if (num1 + num2 == target){
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
    return indices;
    }
}
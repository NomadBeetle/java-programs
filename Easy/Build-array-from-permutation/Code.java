class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int numtoadd = nums[i];
            if (numtoadd < nums.length){
                ans[i] = nums[numtoadd];
            }
        }
        return ans;
    }
}
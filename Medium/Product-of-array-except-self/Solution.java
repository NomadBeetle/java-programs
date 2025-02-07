class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int pre = 1;
        int suff = 1;
        
        // Build prefix product
        answer[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            pre *= nums[i];
            answer[i + 1] = pre;
        }

        // Build suffix product and combine with prefix
        for (int i = nums.length - 1; i > 0; i--) {
            suff *= nums[i];
            answer[i - 1] *= suff;
        }

        return answer;
    }
}

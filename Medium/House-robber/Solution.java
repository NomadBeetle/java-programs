class Solution {
    public int rob(int[] nums) {
        int Money_1 = 0;
        int Money_2 = 0;
        
        for (int i = 0; i < nums.length; i++){
            int temp = Math.max(nums[i] + Money_1, Money_2);
            Money_1 = Money_2;
            Money_2 = temp;
        }

        return Money_2;
    }
}
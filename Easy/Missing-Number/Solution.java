class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        for (int num : nums){
            total += num;
        }

        int realTotal = 0;
        for (int i = 0; i <= nums.length; i++){
            realTotal += i;
        }

        return realTotal - total;
    }
}
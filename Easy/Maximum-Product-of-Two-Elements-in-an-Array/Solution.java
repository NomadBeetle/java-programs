class Solution {
    public int maxProduct(int[] nums) {
        int minNum = Integer.MIN_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums){
            if (num >= maxNum){
                minNum = maxNum;
                maxNum = num;
            } else if (num >= minNum){
                minNum = num;
            }
        }

        return ((maxNum - 1) * (minNum - 1));
    }
}
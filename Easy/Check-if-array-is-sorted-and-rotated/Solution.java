class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int count = 1;
        int x = 0;
        int min_val = Integer.MAX_VALUE;
        boolean res = false;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] <= min_val){
                x = i;
                min_val = nums[i];
            }
        }
        if (len == 1){
            res = true;
        }
        for (int i = x; i < 2 * len - 1; i++){
            if (nums[(i + 1 + x) % len] >= nums[(i + x) % len]){
                count++;
            } else {
                count = 1;
            } 
            if (count == len){
                res = true;
                break;
            }
        }

        return res;
    }
}
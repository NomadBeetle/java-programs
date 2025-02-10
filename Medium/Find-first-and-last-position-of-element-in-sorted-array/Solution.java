class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] index = {-1, -1};
        int right = 0;
        int left = nums.length - 1;
        if (nums.length == 0){
            return index;
        } else {
            while(right <= left){
                if(nums[right] == target){
                    index[0] = right;
                    break;
                }
                right++;
            }
            while (left >= right){
                if(nums[left] == target){
                    index[1] = left;
                    break;
                }
                left--;
            }
        }

        return index;

    }
}
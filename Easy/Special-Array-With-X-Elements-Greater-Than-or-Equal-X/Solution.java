class Solution {
    
    public int specialArray(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int ref = nums[nums.length - 1];

        for (int x = 0; x <= ref; x++){
            int index = bs(nums, x);
            if (len - index == x){
                return x;
            }
        }
        return -1;
    }

    public static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
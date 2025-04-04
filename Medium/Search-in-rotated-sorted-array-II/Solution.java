class Solution {

    private int findpivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]){
                return mid;
            } else if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]){
                return mid + 1;
            }
            if (nums[mid] == nums[start] && nums[end] == nums[mid]){
                if (nums[start] > nums[start + 1]){
                    return start + 1;
                }
                start++;
                if (nums[end] < nums[end - 1]){
                    return end;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    private int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] > target){
                end = mid - 1;
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            } 
        }
        return -1;
    }

    public boolean search(int[] nums, int target) {
        int pivot = findpivot(nums);
        int res = binarySearch(nums, target, pivot, nums.length - 1);
        if (res != -1){
            return true;
        }
        res = binarySearch(nums, target, 0, pivot - 1);
        if (res != -1){
            return true;
        } 
        return false;
    }
}
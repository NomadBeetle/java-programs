class Solution {

    int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] > arr[start]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int findMin(int[] nums) {
        int pivot = findpivot(nums);
        if (nums.length == 1){
            return nums[0];
        }
        return nums[pivot + 1];
    }
}
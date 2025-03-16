class Solution {

    int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[(mid + 1)]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            } else if (arr[mid] < arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = FindPivot(nums);
        int FirstTry = BinarySearch(nums, target, 0, pivot);
        if (FirstTry != -1){
            return FirstTry;
        }

        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}
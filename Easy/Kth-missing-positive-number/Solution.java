class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1); // Number Of Missing elements before mid
            if (missing < k){
                start = mid + 1;
            } else {
                end = mid - 1; 
            }
        }

        return start + k;
    }
}
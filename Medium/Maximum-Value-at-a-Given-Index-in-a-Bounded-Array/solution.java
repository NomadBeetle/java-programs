class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long emptyr = n - index - 1;
        long emptyl = index;
        long ans = 0;
        long start = 1;
        long end = maxSum;
        while (start <= end){
            long mid = start + (end - start) / 2;
            long el = mid - 1;
            long rightsum = 0;
            long leftsum = 0;
            if (emptyr < el){
                rightsum = (el * (el + 1) / 2) - ((el - emptyr) * (el - emptyr + 1) / 2);
            } else {
                rightsum = (el * (el + 1) / 2) + (emptyr - el);
            }

            if (emptyl < el){
                leftsum = (el * (el + 1) / 2) - ((el - emptyl) * (el - emptyl + 1) / 2);
            } else {
                leftsum = (el * (el + 1) / 2) + (emptyl - el);
            }

            if (mid + rightsum + leftsum > maxSum){
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return (int) ans;
    }
}
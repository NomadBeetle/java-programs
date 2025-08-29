class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int total = 0;
        int max = 0;
        for (int item : weights){
            total += item;
            max = Math.max(item, max);
        }

        int start = max;
        int end = total;

        while (start < end){
            int mid = start + (end - start) / 2;
            int curtotal = 0;
            int curdays = 1;
            for (int item : weights){
                if (curtotal + item > mid){
                    curdays++;
                    curtotal = 0;
                }
                curtotal += item;
            }

            if (curdays <= days){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
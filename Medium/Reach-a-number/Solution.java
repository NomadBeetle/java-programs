class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        long start = 0;
        long end = target;
        long minMoves = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum >= target) {
                minMoves = mid; 
                end = mid - 1;  
            } else {
                start = mid + 1; 
            }
        }

        long sum = minMoves * (minMoves + 1) / 2;
        while ((sum - target) % 2 != 0) {
            minMoves++;
            sum = minMoves * (minMoves + 1) / 2;
        }

        return (int) minMoves;
    }
}
class Solution {
    public int arrangeCoins(int n) {
            long start = 1;
            long end = n;
            while (start <= end){
                long mid = start + (end - start) / 2;
                long coinsUsed = mid * (mid + 1) / 2;
                if (coinsUsed == n){
                    return (int)mid;
                } 
                if (coinsUsed > n){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return (int)end;
    }
}
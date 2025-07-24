class Solution {

    private static boolean ifPossible(int[] arr, int k, int len) {
        long total = 0;
        for (int i = 0; i < len; i++) {
            total += arr[i];
        }

        int n = arr.length;

        for (int i = len - 1; i < n; i++) {
            if (i >= len) {
                total -= arr[i - len];
                total += arr[i];
            }

            long cost = 1L * arr[i] * len - total;

            if (cost <= k) return true;
        }

        return false;
    }

    public int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr);

        int low = 1, high = arr.length;
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (ifPossible(arr, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
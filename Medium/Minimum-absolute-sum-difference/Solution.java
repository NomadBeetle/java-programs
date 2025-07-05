class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] sorted = nums1.clone();
        Arrays.sort(sorted);
        long currdiff = 0;
        long maxgain = 0;
        for (int i = 0; i < sorted.length; i++){
            int a = nums1[i];
            int b = nums2[i];
            int diff = Math.abs(a - b);
            currdiff += diff;

            int index = binarySearch(sorted, b);

            if (index < 0){
                index = -index - 1;
            }

            if (index < n){
                int newdiff = Math.abs(sorted[index] - b);
                maxgain = Math.max(maxgain, diff - newdiff);
            }

            if (index > 0){
                int newdiff = Math.abs(sorted[index - 1] - b);
                maxgain = Math.max(maxgain, diff - newdiff);
            }
        }

        long res = (currdiff - maxgain) % (1_000_000_007);
        return (int) res;
    }

    private int binarySearch(int[] sorted, int n){
        int start = 0;
        int end = sorted.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (sorted[mid] < n){
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
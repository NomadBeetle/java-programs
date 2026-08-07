class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArr[] = new int[nums1.length + nums2.length];
        int nums1index = 0;
        int nums2index = nums1.length;
        double res = 0;
        for (int item : nums1){
            mergedArr[nums1index] = item;
            nums1index++;
        }

        for (int item : nums2){
            mergedArr[nums2index] = item;
            nums2index++;
        }

        Arrays.sort(mergedArr);

        if (mergedArr.length % 2 == 0){
            res = (mergedArr[(mergedArr.length - 1) / 2] + mergedArr[((mergedArr.length - 1) / 2) + 1]) / 2.0;
        } else {
            res = mergedArr[(mergedArr.length - 1) / 2];
        }

        return res;
    }

}
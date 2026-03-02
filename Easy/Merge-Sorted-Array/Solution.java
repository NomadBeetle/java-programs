class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n; i++){
            nums1[i] = nums2[j];
            j++;
        }

        for (int i = 0; i < m + n; i++){
            for (int k = 1; k < m + n - i; k++){
                if (nums1[k - 1] > nums1[k]){
                    int temp = nums1[k - 1];
                    nums1[k - 1] = nums1[k];
                    nums1[k] = temp;
                }
            }
        }

    }
}
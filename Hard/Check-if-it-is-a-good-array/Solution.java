class Solution {

    // Function to find GCD using Euclidean Algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public boolean isGoodArray(int[] nums) {
        int GCD = nums[0];

        // Compute GCD for the entire array
        for (int i = 1; i < nums.length; i++) {
            GCD = gcd(GCD, nums[i]);
            if (GCD == 1) { // If GCD becomes 1, return early
                return true;
            }
        }

        return GCD == 1; // Final check after loop
    }
}

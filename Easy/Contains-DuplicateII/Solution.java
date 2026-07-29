class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        while (i < nums.length){

            if (i > k){
                set.remove(nums[i - k - 1]);
            }

            if (set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }

            i++;

        }

        return false;

    }
}
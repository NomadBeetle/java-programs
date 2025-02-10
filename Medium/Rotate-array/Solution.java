class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int counter = 0;
        int i = 0;

        while (counter < nums.length){
            res[i] = nums[((nums.length - (k % nums.length)) + counter) % nums.length];
            counter++;
            i++;
        }

        for (int j = 0; j < nums.length; j++){
            nums[j] = res[j];
        }
    }
}
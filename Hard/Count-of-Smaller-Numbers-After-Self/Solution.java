class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> counts = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--){
            int current = nums[i];

            int position = findPostition(sortedList, nums[i]);
            sortedList.add(position, current);

            counts.add(position);
        }

        Collections.reverse(counts);
        return counts;
    }

    private int findPostition(List<Integer> arr, int value){
        int start = 0;
        int end = arr.size();
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < value){
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
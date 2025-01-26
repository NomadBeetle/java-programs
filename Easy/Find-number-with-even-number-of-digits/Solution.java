class Solution {
    public int findNumbers(int[] nums) {
        ArrayList<String> nums_String = new ArrayList<String>();
        int Count = 0;
        for (int num : nums){
            String num_asString = Integer.toString(num);
            nums_String.add(num_asString);
        }

        for (int i = 0; i < nums_String.size(); i++){
            if (nums_String.get(i).length() % 2 == 0){
                Count += 1;
            }
        } 

        return Count;
    }
}